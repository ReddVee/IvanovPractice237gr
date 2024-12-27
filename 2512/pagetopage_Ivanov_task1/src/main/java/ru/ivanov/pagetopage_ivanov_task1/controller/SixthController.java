package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class SixthController {

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Fiveth-view.fxml", "");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void OkOnAction(ActionEvent event) {

    }

}
