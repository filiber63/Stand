module com.stand {
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
    requires jssc;
    requires org.apache.logging.log4j;
    requires lombok;

    opens com to javafx.fxml;
    exports com;
    exports com.controllers;
    opens com.controllers to javafx.fxml;
}