package ru.ivanov.ivanov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DMController {

    @FXML
    private TextField DtxtField;

    @FXML
    private Label Label;

    @FXML
    private TextField MtxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int day = Integer.parseInt(DtxtField.getText().toString());
        int month = Integer.parseInt(MtxtField.getText().toString());

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            Label.setText("Некорректная дата");
            return;
        }
        int Day, Month;
        switch (month) {
            case 1:
                if (day == 1) {
                    Day = 31;
                    Month = 12;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 2:
                if (day == 1) {
                    Day = 31;
                    Month = 1;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 3:
                if (day == 1) {
                    Day = 28;
                    Month = 2;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 4:
                if (day == 1) {
                    Day = 31;
                    Month = 3;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 5:
                if (day == 1) {
                    Day = 30;
                    Month = 4;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 6:
                if (day == 1) {
                    Day = 31;
                    Month = 5;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 7:
                if (day == 1) {
                    Day = 30;
                    Month = 6;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 8:
                if (day == 1) {
                    Day = 31;
                    Month = 7;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 9:
                if (day == 1) {
                    Day = 31;
                    Month = 8;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 10:
                if (day == 1) {
                    Day = 30;
                    Month = 9;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 11:
                if (day == 1) {
                    Day = 31;
                    Month = 10;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
            case 12:
                if (day == 1) {
                    Day = 30;
                    Month = 11;
                } else {
                    Day = day - 1;
                    Month = month;
                }
                Label.setText("Предыдущая дата: " + Day + "/" + Month);
                break;
        }
    }
}