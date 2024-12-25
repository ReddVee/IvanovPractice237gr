package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class ThirdController {

    @FXML
    private TextField EmailField;

    @FXML
    private TextField PasswordField;

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {
        EmailField.setText("");
        PasswordField.setText("");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016 - Register as a runner");
    }

}
