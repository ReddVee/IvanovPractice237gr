package ru.ivanov.ivanov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.nio.channels.AlreadyBoundException;

public class SEKController {

    @FXML
    private Button BTNVivod;

    @FXML
    private Label Label;

    @FXML
    private TextField NTextField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int N = Integer.parseInt(NTextField.getText().toString());
        int min = N / 60;
        Label.setText("min =" + min);
    }

}
