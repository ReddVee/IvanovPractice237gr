package ru.ivanov.ivanov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DenController {

    @FXML
    private Button BTNNedelya;

    @FXML
    private TextField KTextField;

    @FXML
    private Label LabelDen;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int K = Integer.parseInt(KTextField.getText().toString());
        int B = K % 7;
        if (1<=K&&K<=365)
            switch (B) {
                case 0:
                    LabelDen.setText("День Недели: Понедельник");
                    break;
                case 1:
                    LabelDen.setText("День Недели: Вторник");
                    break;
                case 2:
                    LabelDen.setText("День Недели: Среда");
                    break;
                case 3:
                    LabelDen.setText("День Недели: Четверг");
                    break;
                case 4:
                    LabelDen.setText("День Недели: Пятница");
                    break;
                case 5:
                    LabelDen.setText("День Недели: Суббота");
                    break;
                case 6:
                    LabelDen.setText("День Недели: Воскресенье");
                    break;
            }
            else
                LabelDen.setText("Введите число дней подходящих в этот год");
    }

}
