package org.example.formularioapp.controller;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;
import org.example.formularioapp.FormApplication;
import org.example.formularioapp.model.Usuario;
import org.example.formularioapp.model.UsuarioJSON;
import org.example.formularioapp.model.UsuariosResponse;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private Button botonDetalle, botonAgregar, botonEliminar;

    @FXML
    private CheckBox checkDisponibilidad;

    @FXML
    private ComboBox<Integer> comboEdad;

    @FXML
    private GridPane panelLista;

    @FXML
    private GridPane panelJSON;

    @FXML
    private BorderPane panelGeneral;

    @FXML
    private RadioButton radioFemenino, radioMasculino;

    @FXML
    private TextField textfieldApellido, textfieldNombre, textfieldCorreo;

    @FXML
    private ToggleButton toggleLista;

    @FXML
    private ListView<UsuarioJSON> listViewJSON;

    @FXML
    private ListView<Usuario> listViewUsuarios;


    private ToggleGroup grupoGenero;

    private ObservableList<Integer> listaEdades;

    private ObservableList<Usuario> listaUsuarios;

    private ObservableList<UsuarioJSON> listaUsuariosJSON;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();

        acciones();
    }

    private void acciones() {
        toggleLista.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    panelGeneral.setRight(panelLista);
                    panelGeneral.setLeft(panelJSON);
                } else {
                    panelGeneral.setRight(null);
                    panelGeneral.setLeft(null);
                }
            }
        });

        checkDisponibilidad.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue,
                                Boolean oldValue, Boolean newValue) {
                botonAgregar.setDisable(!newValue);
            }
        });
        botonAgregar.setOnAction(new ManejoAcciones());
        botonDetalle.setOnAction(new ManejoAcciones());
        botonEliminar.setOnAction(new ManejoAcciones());
        listViewUsuarios.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Usuario>() {
            @Override
            public void changed(ObservableValue<? extends Usuario> observableValue, Usuario usuario, Usuario nuevoUsuario) {
                System.out.printf("Usuario Anterior -" + usuario);
                System.out.printf("Usuario nuevo -" + nuevoUsuario);
            }

        });
    }

    private void instancias() {
        listaUsuarios = FXCollections.observableArrayList();
        listaEdades = FXCollections.observableArrayList();
        listaUsuariosJSON = FXCollections.observableArrayList();
        for (int i = 18; i <= 90; i++) {
            listaEdades.add(i); // [18....90]
        }
        grupoGenero = new ToggleGroup();

    }

    private void initGUI() {
        botonAgregar.setDisable(!checkDisponibilidad.isSelected());
        panelGeneral.setRight(null);
        panelGeneral.setLeft(null);
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        comboEdad.setItems(listaEdades);
        listViewUsuarios.setItems(listaUsuarios);
        listViewJSON.setItems(listaUsuariosJSON);

        //1mapper
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            URL url = new URL("https://dummyjson.com/users");
            UsuariosResponse response = objectMapper.readValue(url, UsuariosResponse.class);
            listaUsuariosJSON.addAll(response.getUsers());
        } catch (MalformedURLException e) {
            System.out.println("La url es invalida");
        } catch (StreamReadException | DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //estudiar un formularios que rellenan una clase y se pasa  a lista, luego mostrar detalle, logiga togle y condiciones de enable, mensajes alertas error
    class ManejoAcciones implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == botonAgregar) { //validar datos vacios y mandar avisos de error o correcto en esta fun

                if (textfieldApellido.getText().isEmpty() ||
                        textfieldNombre.getText().isEmpty() ||
                        textfieldCorreo.getText().isEmpty() ||
                        grupoGenero.getSelectedToggle() == null ||
                        comboEdad.getSelectionModel().getSelectedIndex() == -1) {

                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error");
                    alerta.setContentText("Rellena todos los datos");
                    alerta.show();

                } else {
                    Usuario usuario = new Usuario(textfieldNombre.getText(),
                            textfieldApellido.getText(),
                            textfieldCorreo.getText(),
                            ((RadioButton) grupoGenero.getSelectedToggle()).getText(),
                            comboEdad.getSelectionModel().getSelectedItem(),
                            checkDisponibilidad.isSelected()
                    );
                    listaUsuarios.add(usuario);

                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Correcto");
                    alerta.setContentText("Usuario añadido correctamente");
                    alerta.show();
                    limpiarCampos();
                }

            }
            else if (actionEvent.getSource() == botonDetalle) {  //creacion de nueva escena y nuevo stage al pulsar detalle, con su xml asiciado y su controller
                if (listViewUsuarios.getSelectionModel().getSelectedIndex() != -1) {
                     Usuario usuarioSeleccionado = listViewUsuarios.getSelectionModel().getSelectedItem();
                    // System.out.println(usuarioSeleccionado.getGenero());
                    try {
                        Stage ventanaDetalle = new Stage();
                        FXMLLoader loader = new FXMLLoader(FormApplication.class.getResource("detail-view.fxml"));
                        ventanaDetalle.initModality(Modality.APPLICATION_MODAL);
                        ventanaDetalle.setTitle("Dettale de usuario");
                        Parent parent = null;
                        parent = loader.load();
                        DetailController controller = loader.getController();
                        controller.setUsuario(usuarioSeleccionado);
                        ventanaDetalle.setScene(new Scene(parent));
                        ventanaDetalle.show();
                        
                    } catch (IOException e) {
                        System.out.printf("Error en la localizacion del fichero");
                    }

                } else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Seleccion");
                    alert.setContentText("No hay elemento seleccionado");
                    alert.show();
                }

            } else if (actionEvent.getSource() == botonEliminar) {
                if (listViewUsuarios.getSelectionModel().getSelectedIndex() != -1) {
                    listaUsuarios.remove(listViewUsuarios.getSelectionModel().getSelectedItem());
                    listViewUsuarios.getSelectionModel().select(-1);
                }
            }
        }
    }

    //hacer una fun ara mostrar en una alert de tipo INFORMATION  los valores del usuario
    private void limpiarCampos() {
        textfieldApellido.clear();
        textfieldNombre.clear();
        textfieldCorreo.clear();
        checkDisponibilidad.setSelected(false);
        comboEdad.getSelectionModel().select(-1);
        grupoGenero.selectToggle(null);
    }
}