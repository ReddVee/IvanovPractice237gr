package ru.ivanov.ivanov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KVController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button BTNVivod;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label VivodLabel;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int a = Integer.parseInt(ATextField.getText().toString());
        int b = Integer.parseInt(BTextField.getText().toString());
        int c = Integer.parseInt(CTextField.getText().toString());
        int KKPD = a/c;
        int KKPS = b/c;
        int VKv = KKPD*KKPS;
        int PP = a*b;
        int PKv = VKv * (c*c);
        int FP = PP - PKv;
        VivodLabel.setText("Количество квадратов: " +VKv + "Площадь незанятой части: " + FP);
    }

}
