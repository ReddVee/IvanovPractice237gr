package ru.ivanov.ivanov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PController {

    @FXML
    private Button BTN;
    private final double INITIAL_DEPOSIT = 1000;
    private final double TARGET_DEPOSIT = 1100;
    @FXML
    private Label KTxtField;

    @FXML
    private Label Label;

    @FXML
    private TextField PTxtField;

    @FXML
    private Label STxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        double P = Double.parseDouble(PTxtField.getText().toString());
        if (P <= 0 || P >= 25) {
            Label.setText("Процентная ставка должна быть в диапазоне (0 - 25)");
        }
        double CD = INITIAL_DEPOSIT;
        int k = 0;
        while(CD <= TARGET_DEPOSIT){
            CD = CD + (CD*P/100);
            k++;
        }
        KTxtField.setText("Месяцев: "+k);
        STxtField.setText("Итоговая сумма: =%f"+CD);
    }
}
