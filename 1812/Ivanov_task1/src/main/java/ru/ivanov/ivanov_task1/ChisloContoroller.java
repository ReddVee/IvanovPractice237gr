package ru.ivanov.ivanov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChisloContoroller {

    @FXML
    private Button BTN;

    @FXML
    private TextField ChisloTextField;

    @FXML
    private Label DVLabel;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int a = Integer.parseInt(ChisloTextField.getText().toString());
        int b = a/10;
        int c = a%10;
        int d = c * 10 + b;
        DVLabel.setText("dv = " + d);
    }

}
