package ru.ivanov.pagetopage_ivanov_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import static ru.ivanov.pagetopage_ivanov_task1.util.Manager.showSecondStage;

public class FivethController {
    public int total=0;
    public String s="$";

    @FXML
    private Label $$$;

    @FXML
    private RadioButton VA;

    @FXML
    private RadioButton VB;

    @FXML
    private RadioButton VC;

    @FXML
    private CheckBox FirstKmCheckBox;

    @FXML
    private CheckBox SecondKmCheckBox;

    @FXML
    private CheckBox ThirdKmCheckBox;

    @FXML
    void CheckBoxOne(ActionEvent event){
        if (FirstKmCheckBox.isSelected()) {
            total += 145;
        } else total-=145;
        $$$.setText(s+String.valueOf(total));
    }

    @FXML
    void CheckBoxTwo(ActionEvent event){
        if (SecondKmCheckBox.isSelected()) {
            total += 75;
        }else total-=75;
        $$$.setText(s+String.valueOf(total));
    }

    @FXML
    void CheckBoxThree(ActionEvent event){
        if (ThirdKmCheckBox.isSelected()) {
            total += 20;
        } else total-=20;
        $$$.setText(s+String.valueOf(total));
    }

    @FXML
    void BackOnAction(ActionEvent event) {
        showSecondStage("Fourth-view.fxml","");
    }

    @FXML
    void CancelOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showSecondStage("Begun-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void RegisterOnAction(ActionEvent event) {
        if((FirstKmCheckBox.isSelected() || ThirdKmCheckBox.isSelected()|| SecondKmCheckBox.isSelected()) && (VA.isSelected()|| VB.isSelected() || VC.isSelected())) {
            if (total > 0) {
                showSecondStage("Seven-view.fxml", "");
            }
        }
    }

    @FXML
    void VARadBtn(ActionEvent event) {
        if (VA.isSelected()) {
            total += 0;
        } else total-=0;
        $$$.setText(s+String.valueOf(total));
    }

    @FXML
    void VBRadBtn(ActionEvent event) {
        if (VB.isSelected()) {
            total += 20;
        } else total-=20;
        $$$.setText(s+String.valueOf(total));
    }

    @FXML
    void VCRadBtn(ActionEvent event) {
        if (VC.isSelected()) {
            total += 45;
        } else total-=45;
        $$$.setText(s+String.valueOf(total));
    }

}
