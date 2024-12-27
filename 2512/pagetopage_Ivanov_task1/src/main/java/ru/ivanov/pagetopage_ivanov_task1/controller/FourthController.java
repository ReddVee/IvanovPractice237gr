package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.awt.*;
import java.io.*;
import java.util.EmptyStackException;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class FourthController {
    @FXML
    private Label trylabel;

    @FXML
    private TextField CountryField;

    @FXML
    private TextField DRField;

    @FXML
    private TextField EField;

    public void EFieldOnAction(String text) {
        EField.setText(text);
    }
    @FXML
    private TextField FField;

    @FXML
    private TextField MaleField;

    @FXML
    private TextField NField;

    @FXML
    private TextField PField;

    @FXML
    private TextField PPField;

    @FXML
    private TextField PhotoField;

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Third-view.fxml","");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {
        CountryField.setText("");
        DRField.setText("");
        EField.setText("");
        FField.setText("");
        MaleField.setText("");
        NField.setText("");
        PField.setText("");
        PPField.setText("");
        PhotoField.setText("");
    }

    @FXML
    void EFieldOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void PFieldOnAction(ActionEvent event) {

    }

    @FXML
    void RegisterOnAction(ActionEvent event) {
        String email = EField.getText().toString();
        String pas =PField.getText().toString();
        String povpas = PPField.getText().toString();
        boolean s = pas.equals(povpas);
        int i = 1;
        if (email.isEmpty() || pas.isEmpty() || s == false) {
            trylabel.setText("Пожалуйста, заполните все поля правильно");
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
                trylabel.setText("Пожалуйста заполните всю информацию, чтобы зарегистрироваться в качестве бегуна");
            }));
            timeline.setCycleCount(1);
            timeline.play();
        } else {
            try (BufferedReader br = new BufferedReader(new FileReader("UserLog.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length > 0 && parts[0].trim().equalsIgnoreCase(email.trim())) {
                        trylabel.setText("email уже занят");
                        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), e -> {
                            trylabel.setText("Пожалуйста заполните всю информацию, чтобы зарегистрироваться в качестве бегуна");
                        }));
                        timeline.setCycleCount(1);
                        timeline.play();
                        return ;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter wr = new BufferedWriter(new FileWriter("UserLog.txt", true))) {
            wr.write(email + ";" + pas);
            wr.newLine();
            trylabel.setText("Регистрация успешна!");
            EField.clear();
            PField.clear();
            PPField.clear();
            showSecondStage("Seventh-view.fxml", "");
        } catch (IOException e) {
            trylabel.setText("Ошибка при сохранении данных.");
        }
    }

}

