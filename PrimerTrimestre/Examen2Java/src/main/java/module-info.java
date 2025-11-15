module org.example.examen2java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires lombok;

    opens org.example.examen2java to javafx.fxml, lombok;

    opens org.example.examen2java.controller to javafx.fxml;

    opens org.example.examen2java.model to javafx.fxml;

    exports org.example.examen2java;
}