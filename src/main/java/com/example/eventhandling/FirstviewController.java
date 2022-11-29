package com.example.eventhandling;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FirstviewController extends AnchorPane {
    public FirstviewController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("firstview.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

