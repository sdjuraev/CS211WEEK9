package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ShapesController {
@FXML
    Pane shapeviewPane;
@FXML
    private void textButton()
{
    Text text=new Text();
    text.setText("This is a simple text");
    text.setFont(Font.font("Times New Roman", FontWeight.BLACK, FontPosture.ITALIC, 40 ));
    shapeviewPane.getChildren().add(text);
}
@FXML
    private void addLine()
{
    Line line =new Line(10,10,150,150);
    line.setStroke(Color.GREEN);
    line.setStrokeWidth(5);
    shapeviewPane.getChildren().add(line);

}


@FXML
    private void showClock(){
    ClockPane showClock=new ClockPane();
    Stage stage=new Stage();
    Scene scene=new Scene(showClock, 300,300);
    stage.setScene(scene);
    stage.setTitle("Show Current Clock");
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.show();

}
}

