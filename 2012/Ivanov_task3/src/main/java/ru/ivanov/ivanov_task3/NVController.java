package ru.ivanov.ivanov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.concurrent.RecursiveTask;

import static java.lang.Math.*;

public class NVController {

    @FXML
    private Label DTxtField;

    @FXML
    private Label LTxtField;

    @FXML
    private TextField NumTxtFeild;

    @FXML
    private Label RTxtField;

    @FXML
    private Label STxtField;

    @FXML
    private TextField ValueTxtField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int Num = Integer.parseInt(NumTxtFeild.getText().toString());
        int Value = Integer.parseInt(ValueTxtField.getText().toString());
        if (Num<1 || Num>4){
        }
        double Radius =1, Diameter=1, Length=1, Area=1;
        switch (Num){
            case 1:
                Radius=Value;
                Diameter=2*Radius;
                Length=2*3.14*Radius;
                Area=3.14*pow(Radius,2);
                break;
            case 2:
                Diameter=Value;
                Radius=Diameter/2;
                Length=2*3.14*Radius;
                Area=3.14*pow(Radius,2);
                break;
            case 3:
                Length=Value;
                Radius=Length/(2*3.14);
                Diameter=2*Radius;
                Area=3.14*pow(Radius,2);
                break;
            case 4:
                Area=Value;
                Radius=sqrt(Area/3.14);
                Diameter=2*Radius;
                Length=2*3.14*Radius;
                break;
        }
        RTxtField.setText("Радиус =" + Radius);
        DTxtField.setText("Диаметр =" + Diameter);
        LTxtField.setText("Длина =" + Length);
        STxtField.setText("Площадь =" + Area);
    }
}
