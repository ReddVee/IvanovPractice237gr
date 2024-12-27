package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.ivanov.pagetopage_ivanov_task1.util.Manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.*;

public class ThirdController {

    @FXML
    private TextField EEField;
    public void handleSwitchToSecondPage (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fourth-view.fxml"));
        Parent root = loader.load();
        FourthController fourthController = loader.getController();
        fourthController.EFieldOnAction(EEField.getText());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Button Logout;

    @FXML
    private Button Back;

    @FXML
    private TextField PPField;

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Second-view.fxml","");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {
        EEField.setText("");
        PPField.setText("");
    }

    @FXML
    void LoginOnAction(ActionEvent event) {

        String email = EEField.getText().toString();
        String pas = PPField.getText().toString();


        try (BufferedReader reader = new BufferedReader(new FileReader("UserLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String existingUsername = parts[0];
                String existingPassword = parts[1];
                if (existingUsername.equals(email) && existingPassword.equals(pas)) {
                    showSecondStage("Seventh-view.fxml", "");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при проверке имени пользователя: " + e.getMessage());
        }
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }
}
