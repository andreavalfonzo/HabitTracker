package com.example.habittracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TrackerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}