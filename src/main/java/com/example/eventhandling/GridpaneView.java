package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;

public class GridpaneView {
    CheckBox checkBox=new CheckBox();
    int count=1;
    @FXML
    GridPane gridPane;
    @FXML
    private void addCheckBox()
    {
        if (count==1){
            count=2;
       gridPane.add(checkBox,2,2);}
        else {
            checkBox.setSelected(true);
        }
    }
}
