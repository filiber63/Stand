package com.controllers;

import com.model.IBracket;
import com.model.bracket_ds.BracketDS;
import com.model.files_ds.FilesDS;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/** КЛАСС КОНТРОЛЛЕРА ГЛАВНОГО ОКНА */
public class MainController {
    private final IBracket iBracket;
    @FXML
    public Button btnUp;
    @FXML
    public Button btnDown;
    @FXML
    public Button btnStop;


    /** КОНСТРУКТОР */
    public MainController()  {
      iBracket = new BracketDS(new FilesDS("app.properties"));
    }

    /** ДВИЖЕНИЕ КРОНШТЕЙНА ВВЕРХ */
    @FXML
    public void onBtnUpClick() {
        iBracket.bracketUp(1);
    }

    /** ДВИЖЕНИЕ КРОНШТЕЙНА ВНИЗ */
    @FXML
    public void onBtnDownClick() {
        iBracket.bracketDown(1);
    }

    /** ОСТАНОВКА КРОНШТЕЙНА */
    @FXML
    public void onBtnStopClick() {
        iBracket.bracketStop(1);
    }
}