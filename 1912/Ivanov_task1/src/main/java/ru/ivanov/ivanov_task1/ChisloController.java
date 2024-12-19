package ru.ivanov.ivanov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChisloController {

    @FXML
    private Button BTN;

    @FXML
    private TextField KTextField;

    @FXML
    private Label Otvet;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int a = Integer.parseInt(KTextField.getText().toString());
        int b = a/10;
        int c = a%10;
        int d = b+c;
        if (d%3 == 0){
            Otvet.setText("Двузначное число кратно 3");
        }else
            Otvet.setText("Двузначное число не кратно 3");
    }

}
