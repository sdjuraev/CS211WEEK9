package com.example.eventhandling;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;

import java.io.IOException;

public class SecondviewController extends FlowPane {
    public SecondviewController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("secondview.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
