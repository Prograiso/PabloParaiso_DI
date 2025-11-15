package org.example.examen2java.controller;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import org.example.examen2java.model.Pedido;
import org.example.examen2java.model.Pizza;

import static javafx.beans.binding.Bindings.when;

public class PizzeriaController implements Initializable {

    @FXML
    private Button btnRealizarPedido;

    @FXML
    private ComboBox<String> comboPizza;

    @FXML
    private Label labelPizzeria;

    @FXML
    private ListView<Pedido> listViewPedido;

    @FXML
    private GridPane panelListaPedido;

    @FXML
    private RadioButton radioFamiliar;

    @FXML
    private RadioButton radioMediana;

    @FXML
    private RadioButton radioPequena;

    @FXML
    private TextField tfNombre;

    @FXML
    private TextField tfTelefono;

    private ToggleGroup radioGroup;

    private ObservableList<Pizza> listaPizzas;

    private ObservableList<Pedido> listaPedidos;

    private ObservableList<String> listaComboPizzas;

    private int idPedido = listaPedidos.size() - (listaPedidos.size()-1);

    private String precio;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        acciones();
    }


    private void instancias() {
        listaPedidos= FXCollections.observableArrayList();
        listaPizzas= FXCollections.observableArrayList();
        listaComboPizzas= FXCollections.observableArrayList("Barbacoa", "Hawaiana", "Jamon Queso","Cuatro Quesos");
        radioGroup = new ToggleGroup();


    }

    private void initGUI() {
        listViewPedido.setItems(listaPedidos);
        comboPizza.setItems(listaComboPizzas);
        radioGroup.getToggles().addAll(radioFamiliar,radioMediana,radioPequena);




    }

    private void acciones() {

        radioGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {

            }
        });
        btnRealizarPedido.setOnAction(new ManejadorAcciones());
    }

    class ManejadorAcciones implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            if(actionEvent.getSource()==btnRealizarPedido){
                if(tfNombre.getText().isEmpty() || tfTelefono.getText().isEmpty() ||
                radioGroup.getSelectedToggle()==null || comboPizza.getSelectionModel()==null){

                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error");
                    alerta.setContentText("Rellena los campos");
                    alerta.show();

                }
                else{
                    Pizza pizza = new Pizza(comboPizza.getSelectionModel().getSelectedItem(),radioGroup.getSelectedToggle().toString(),)
                    Pedido pedido = new Pedido(idPedido,tfNombre.getText(),tfTelefono.getText(),)
                }
            }
        }
    }

    public void limpiarTodo(){
        tfNombre.clear();
        tfTelefono.clear();
        comboPizza.getSelectionModel().isEmpty();
        radioGroup.selectedToggleProperty();
    }

}
