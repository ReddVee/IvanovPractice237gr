package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void NoviOnAction(ActionEvent event) {
            showSecondStage("Fourth-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void RaneeOnAction(ActionEvent event) {
        showSecondStage("Third-view.fxml","Marathon Skills 2016 - Login");
    }

}
