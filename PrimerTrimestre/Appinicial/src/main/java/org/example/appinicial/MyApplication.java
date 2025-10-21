package org.example.appinicial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       // pasos: 1- FXMLLOader -> archivo fxml
        FXMLLoader loader = new FXMLLoader(MyApplication.class.getResource("vistas/main-view.fxml"));
        // 2- cargar el archivo fxml
        Parent root = loader.load();
        // 3- crear la escena (scene)
        Scene scene = new Scene(root);
        //4- poner la scene en el stage
        stage.setScene(scene);
        //5- poner titulo
        stage.setTitle("Ventana Inicial");
        //6- Hacerla visible, mostrar
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(MyApplication.class, args);
    }
}
