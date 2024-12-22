package ru.ivanov.ivanov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FactController {

    @FXML
    private Label Label;

    @FXML
    private TextField NTxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
     int n = Integer.parseInt(NTxtField.getText().toString());
     if (n <= 0){
         Label.setText("N должно быть больше 0");
     }
     double factorial = 1;
     for (int i = 2; i <= n; i++){
         factorial *= i;
     }
     Label.setText("" +factorial);
    }
}
