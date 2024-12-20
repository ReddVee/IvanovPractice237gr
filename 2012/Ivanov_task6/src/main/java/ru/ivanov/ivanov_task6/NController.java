package ru.ivanov.ivanov_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NController {

    @FXML
    private Label Label;

    @FXML
    private TextField NTxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTxtField.getText().toString());
        if (N <= 0) {
            Label.setText("N должно быть больше 0");
        }
        boolean Seven = false;
        while (N > 0) {
            if (N%10 == 7) {
            Seven = true;
            break;
        }
        N /= 10;
        }
        Label.setText(String.valueOf(Seven));
    }
}