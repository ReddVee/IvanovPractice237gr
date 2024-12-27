package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    void BackOnAction(ActionEvent event) {
            showSecondStage("Begun-view.fxml","");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {
            showSecondStage("Third-view.fxml","");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
            showSecondStage("Begun-view.fxml","");
    }

    @FXML
    void NoviOnAction(ActionEvent event) {
            showSecondStage("Fourth-view.fxml", "");
    }

    @FXML
    void RaneeOnAction(ActionEvent event) {
            showSecondStage("Third-view.fxml","");
    }

}
