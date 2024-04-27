package com.example.habittracker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TrackerController {

    @FXML
    protected CheckBox checkBox1;
    @FXML
    protected CheckBox checkBox2;
    @FXML
    protected CheckBox checkBox3;
    @FXML
    protected Button button;
    @FXML
    protected Label counterLabel;

    // Contador para el número de CheckBoxes marcadas
    protected int counter = 0;

    // Método para el botón Finalizar día
    @FXML
    protected void onButtonDay() {
        // Incrementar el contador según las CheckBoxes marcadas
        counter = 0;
        if (checkBox1.isSelected()) {
            counter++;
        }
        if (checkBox2.isSelected()) {
            counter++;
        }
        if (checkBox3.isSelected()) {
            counter++;
        }

        // Mostrar el resultado al dividir el contador por 3
        counterLabel.setText("Tu porcentaje de tu mejor versión: " + String.valueOf((counter * 100) / 3) + "%");
    }

    // No es necesario incrementar el contador en los métodos de CheckBox,
    // ya que se hace en el método onButtonDay
    // Métodos para CheckBox1, CheckBox2 y CheckBox3
    @FXML
    protected void onCheckBox1() {
    }

    @FXML
    protected void onCheckBox2() {
    }

    @FXML
    protected void onCheckBox3() {
    }
}
