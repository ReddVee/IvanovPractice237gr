package ru.ivanov.ivanov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgeController {

    @FXML
    private TextField AgeTextField;

    @FXML
    private Label Label;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int age = Integer.parseInt(AgeTextField.getText().toString());
        if (age<20||age>69){
            Label.setText("Возраст должен быть в диапазоне от 20 до 69.");
        }
        int Age1 = age/10;
        int Age2 = age%10;
        String Age1String = "";
        switch (Age1){
            case 2:
                Age1String = ("Двадцать");
                break;
            case 3:
                Age1String = ("Тридцать");
                break;
            case 4:
                Age1String = ("Сорок");
                break;
            case 5:
                Age1String = ("Пятьдесят");
                break;
            case 6:
                Age1String = ("Шестьдесят");
                break;
        }
        String Age2String = "";
        if (Age2 > 0){
            switch (Age2){
                case 1:
                    Age2String = (" Один");
                    break;
                case 2:
                    Age2String = (" Два");
                    break;
                case 3:
                    Age2String = (" Три");
                    break;
                case 4:
                    Age2String = (" Четыре");
                    break;
                case 5:
                    Age2String = (" Пять");
                    break;
                case 6:
                    Age2String = (" Шесть");
                    break;
                case 7:
                    Age2String = (" Семь");
                    break;
                case 8:
                    Age2String = (" Восемь");
                    break;
                case 9:
                    Age2String = (" Девять");
                    break;
            }
        }
        String yearword = "";
        if (Age2==1){
            yearword = " Год";
        } else if (Age2 >= 2 && Age2 <=4) {
            yearword = " Года";
        }else {
            yearword = " Лет";
        }
        Label.setText(""+ Age1String + Age2String + yearword);
    }
}
