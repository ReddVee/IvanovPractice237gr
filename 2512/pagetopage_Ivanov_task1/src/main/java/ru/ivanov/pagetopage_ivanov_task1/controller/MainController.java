package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class MainController {

    @FXML
    void BackOnAction(ActionEvent event) {

    }

    @FXML
    void BegunOnAction(ActionEvent event) {
        showSecondStage("Second-view.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {
        showSecondStage("Second-view.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {

    }

}
