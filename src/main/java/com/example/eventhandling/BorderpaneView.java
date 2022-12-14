package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;


public class BorderpaneView {
    @FXML
    BorderPane mainBorderPane;
    @FXML
    private void firstButton(){
        FirstviewController firstviewController=new FirstviewController();
        this.mainBorderPane.setCenter(firstviewController);
    }
    @FXML
    private void secondButton(){


    }
}

