package org.example.formularioapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.example.formularioapp.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailController implements Initializable {

    @FXML
    private Label etiquetaTitulo;//deberes pasar usuarios a las etiquetas VAMOOOOOOOOOS
    private String textoComunicado;
    private Usuario usuarioSeleccionado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        //etiquetaTitulo.setText("Ventana arrancada correctamente");

    }

    private void initGUI() {
        etiquetaTitulo.setText(textoComunicado);
    }

    private void instancias() {
        textoComunicado = "";

    }

    public  void  setUsuario(Usuario usuario){
        textoComunicado = usuario.toString();
        etiquetaTitulo.setText(textoComunicado);
    }
}
