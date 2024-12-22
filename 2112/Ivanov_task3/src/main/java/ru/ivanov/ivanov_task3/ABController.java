package ru.ivanov.ivanov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ABController {

    @FXML
    private Label Label;

    @FXML
    private TextField aTxtField;

    @FXML
    private TextField bTxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTxtField.getText().toString());
        int b = Integer.parseInt(bTxtField.getText().toString());
        if (a>=b){
            Label.setText("A должно быть меньше B");
            return;
        }
        int sum = 0;
        for (int i = a; i<=b; i++){
            sum += i * i;
        }
        Label.setText("" +sum);
    }
}
