package ru.ivanov.ivanov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NController {

    @FXML
    private Label Label;

    @FXML
    private TextField NtxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int N = Integer.parseInt(NtxtField.getText().toString());
        int k = 0;
        while ((k+1)*(k+1)<=N){
            k++;
        }
        Label.setText("Наибольшее число K= " +k);
    }

}
