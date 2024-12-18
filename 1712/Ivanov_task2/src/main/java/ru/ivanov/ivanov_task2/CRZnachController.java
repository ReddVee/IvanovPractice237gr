package ru.ivanov.ivanov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CRZnachController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button BtnCA;

    @FXML
    private Label Label;

    @FXML
    void CRZnachOnAction(ActionEvent event) {
        float A = Float.parseFloat(ATextField.getText().toString());
        float B = Float.parseFloat(BTextField.getText().toString());
        Label.setText("Z = " + (A+B)/2);
    }

}
