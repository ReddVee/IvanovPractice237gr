package ru.ivanov.ivanov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class TochkaController {

    @FXML
    private ImageView Imageе;

    @FXML
    private Label VivodLabel;

    @FXML
    private Label t;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int x = Integer.parseInt(xTextField.getText().toString());
        int y = Integer.parseInt(yTextField.getText().toString());
        InputStream image = getClass().getResourceAsStream("photo_2024-12-19_23-39-46.jpg");
        Imageе.setImage(new Image(image));
        if (y<x && x<70 && y>0){
            VivodLabel.setText("Да");
        } else if (y==x && x==70 || x==70 && y==0 || x==0 && y==x) {
            VivodLabel.setText("На границе");
        }else {
            VivodLabel.setText("Нет");
        }
    }

}
