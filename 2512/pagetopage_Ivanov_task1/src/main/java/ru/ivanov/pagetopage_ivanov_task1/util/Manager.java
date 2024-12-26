package ru.ivanov.pagetopage_ivanov_task1.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.ivanov.pagetopage_ivanov_task1.HelloApplication;

import java.io.IOException;


public class Manager {
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
    public static void showMainStage(Stage stage, String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try{
            Scene scene = new Scene(fxmlLoader.load());
            stage.setResizable(false);
            stage.setScene((scene));
            stage.setTitle(title);
            stage.setMinHeight(200);
            stage.setMinWidth(300);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showSecondStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            mainStage.setResizable(false);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
