package org.example.formularioapp.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import org.example.formularioapp.model.Usuario;

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
    private BorderPane panelGeneral;

    @FXML
    private RadioButton radioFemenino, radioMasculino;

    @FXML
    private TextField textfieldApellido, textfieldNombre ,textfieldCorreo;

    @FXML
    private ToggleButton toggleLista;

    @FXML
    private ListView<Usuario> listViewUsuarios;


    private ToggleGroup grupoGenero;

    private ObservableList<Integer> listaEdades;

    private ObservableList<Usuario> listaUsuarios;

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
                if(newValue){
                    panelGeneral.setRight(panelLista);
                } else{
                    panelGeneral.setRight(null);
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


    }

    private void instancias() {
        listaUsuarios = FXCollections.observableArrayList();
        listaEdades = FXCollections.observableArrayList();
        for (int i = 18; i <= 90; i++) {
            listaEdades.add(i); // [18....90]
        }
        grupoGenero = new ToggleGroup();

    }

    private void initGUI() {
        botonAgregar.setDisable(!checkDisponibilidad.isSelected());
        botonDetalle.setDisable(listaUsuarios.isEmpty());
        panelGeneral.setRight(null);
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        comboEdad.setItems(listaEdades);
        listViewUsuarios.setItems(listaUsuarios);
    }
    //estudiar un formularios que rellenan una clase y se pasa  a lista, luego mostrar detalle, logiga togle y condiciones de enable, mensajes alertas error
    class ManejoAcciones implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == botonAgregar) { //validar datos vacios y mandar avisos de error o correcto en esta fun

                if(textfieldApellido.getText().isEmpty() ||
                    textfieldNombre.getText().isEmpty()||
                    textfieldCorreo.getText().isEmpty()||
                    grupoGenero.getSelectedToggle()== null||
                    comboEdad.getSelectionModel().getSelectedIndex()==-1){

                    Alert alerta = new  Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error");
                    alerta.setContentText("Rellena todos los datos");
                    alerta.show();

                }
                else{
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

            }else if(actionEvent.getSource()==botonDetalle){
                if(listViewUsuarios.getSelectionModel().getSelectedIndex()!=-1){
                    Usuario usuarioSeleccionado = listViewUsuarios.getSelectionModel().getSelectedItem();
                    System.out.println(usuarioSeleccionado.getGenero());
                }

            }
        }
    }
//hacer una fun ara mostrar en una alert de tipo INFORMATION  los valores del usuario
    private void  limpiarCampos() {
        textfieldApellido.clear();
        textfieldNombre.clear();
        textfieldCorreo.clear();
        checkDisponibilidad.setSelected(false);
        comboEdad.getSelectionModel().select(-1);
        grupoGenero.selectToggle(null);
    }
}