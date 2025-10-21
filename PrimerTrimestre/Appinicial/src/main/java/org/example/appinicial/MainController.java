package org.example.appinicial;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import org.controlsfx.control.action.Action;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //llamar a cada una de las variables del fxml (parte gráfica)
    @FXML
    private Button botonEnviar, botonVaciar;
    @FXML
    private TextField textField;
    @FXML
    private Label labelSaludo;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private Button botonBorrar;
    @FXML
    private MenuButton menu;

    private DropShadow sombra;


//llama a cada una de las variables de la parte gráfica
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        instancias();
        initGUI();
        acciones();

    }

    private void initGUI(){
        botonEnviar.setEffect(null);
        botonVaciar.setEffect(null);
        botonBorrar.setEffect(null);
    }


    private void instancias(){
        sombra = new DropShadow();
    }

    //Poner a escuchar los cliks de los botones
    private void acciones() {
        ManejadorGeneral manejadorGeneral = (new ManejadorGeneral());

        botonEnviar.setOnAction(manejadorGeneral::handle);
        botonBorrar.setOnAction(manejadorGeneral::handle);
        botonVaciar.setOnAction(manejadorGeneral::handle);

//        botonEnviar.setOnMouseEntered(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                //cuando el tipo de evento es enter
//                botonEnviar.setEffect(sombra);
//            }
//        });
//
//        botonEnviar.setOnMouseExited(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                //cuando el tipo de evento es exit
//                botonEnviar.setEffect(null);
//            }
//        });
//        botonEnviar.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                if (textFieldNombre.getText().isEmpty()) {
//                    labelSaludo.setText("No puedes completar la tarea");
//                } else {
//                    labelSaludo.setText(textFieldNombre.getText() + " ENHORABUENA PROYECTO COMPLETO!");
//                    textField.clear();
//                }
//            }
//        });
//
//        botonBorrar.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                labelSaludo.setText("ESTO SE HA BORRADO!");
//            }
//        });
//        botonVaciar.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                textFieldNombre.clear();
//            }
//        });
    //intentar enviar nombre al titulo con enorabuena proyecto completo, vaciar vacia el texto y crear otro boton
            // abajo que vacíe el texto centrarl y deje labelSaludo en blanco O como antes

        botonEnviar.setOnMouseEntered(new ManejadorGeneral());
        botonBorrar.setOnMouseEntered(new ManejadorGeneral());
        botonVaciar.setOnMouseEntered(new ManejadorGeneral());
        botonEnviar.setOnMouseExited(new ManejadorGeneral());
        botonBorrar.setOnMouseExited(new ManejadorGeneral());
        botonVaciar.setOnMouseExited(new ManejadorGeneral());
        botonEnviar.setOnMousePressed(new ManejadorGeneral());
        botonEnviar.setOnMouseReleased(new ManejadorGeneral());
        botonVaciar.setOnMouseReleased(new ManejadorGeneral());
    }


    class ManejadorGeneral implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            Button button = (Button) event.getSource();

            if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                button.setEffect(sombra);
                if (button == botonEnviar) {
                    button.setCursor(Cursor.HAND);
                }
                else if (button == botonBorrar) {
                    button.setCursor(Cursor.CROSSHAIR);
                }
                else if(button == botonVaciar){
                    button.setCursor(Cursor.WAIT);
                }
            } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
                button.setEffect(null);
                if(button==botonEnviar){
                    button.setCursor(Cursor.DEFAULT);
                }
            } else if(event.getEventType()==MouseEvent.MOUSE_PRESSED){
                button.setCursor(Cursor.CLOSED_HAND);
            } else if (event.getEventType()==MouseEvent.MOUSE_RELEASED){
                button.setCursor(Cursor.HAND);
            }

            TextField textField = (TextField) event.getSource();


            System.out.printf("Boton pulsado, procedemos con las acciones individuales");

            if (event.getEventType() == ActionEvent.ACTION) {

                if (button == botonEnviar) {
                    if (textFieldNombre.getText().isEmpty()) {
                        labelSaludo.setText("No puedes completar la tarea");
                    } else {
                        labelSaludo.setText(textFieldNombre.getText() + " ENHORABUENA PROYECTO COMPLETO!");
                        textField.clear();
                    }
                } else if (button == botonBorrar) {
                    labelSaludo.setText("ESTO SE HA BORRADO!");
                    textFieldNombre.clear();
                } else if (button == botonVaciar) {
                    textFieldNombre.clear();
                }
            }
        }

    }

}
