package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/** ГЛАВНЫЙ КЛАСС */
public class Main extends Application {

    /** ПОДГОТОВКА СЦЕНЫ */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Испытательный стенд (v1.0)");
        stage.setScene(scene);
        stage.show();
    }

    /** ЗАПУСК ПРИЛОЖЕНИЯ */
    public static void main(String[] args) {
        launch();
    }
}