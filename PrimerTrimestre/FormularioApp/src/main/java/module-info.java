module org.example.formularioapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    requires lombok; //añadida para crear clases esta libreria y añadida a dependencyes


    opens org.example.formularioapp to javafx.fxml;
    exports org.example.formularioapp;

    exports org.example.formularioapp.model;
    opens org.example.formularioapp.model to javafx.fxml, lombok;//hay que añadirlo aquí tambien sino no va

    exports org.example.formularioapp.controller;
    opens org.example.formularioapp.controller to javafx.fxml;
}