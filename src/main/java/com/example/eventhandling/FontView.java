package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FontView {
    @FXML
    Label fontLabel;
    @FXML
    private void setFontLabel()
    {
        fontLabel.setFont(Font.font("Times New Roman", FontWeight.BLACK, FontPosture.ITALIC, 50));
    }
}
