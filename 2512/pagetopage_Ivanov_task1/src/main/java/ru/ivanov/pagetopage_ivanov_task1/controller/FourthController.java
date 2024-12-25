package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class FourthController {

    @FXML
    private TextField CountryField;

    @FXML
    private TextField DRField;

    @FXML
    private TextField EField;

    @FXML
    private TextField FField;

    @FXML
    private TextField MaleField;

    @FXML
    private TextField NField;

    @FXML
    private TextField PField;

    @FXML
    private TextField PPField;

    @FXML
    private TextField PhotoField;

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {
        CountryField.setText("");
        DRField.setText("");
        EField.setText("");
        FField.setText("");
        MaleField.setText("");
        NField.setText("");
        PField.setText("");
        PPField.setText("");
        PhotoField.setText("");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016 - Register as a runner");
    }
}
