package ru.ivanov.ivanov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button BtnSumm;

    @FXML
    private Label LabelField;

    @FXML
    void sumBtnOnAction(ActionEvent event) {
        float A =Float.parseFloat(ATextField.getText().toString());
        float B =Float.parseFloat(BTextField.getText().toString());
        LabelField.setText("S =" + (A+B));
    }

}
