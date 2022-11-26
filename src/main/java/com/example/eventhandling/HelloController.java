package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    Button fontCLass;

    @FXML
    private void showFontClass() throws IOException {
        showViews("font-view.fxml", "Font View");
    }
    @FXML
    private void showImageView() throws IOException {
        showViews("image-view.fxml", "Image View");
    }
    @FXML
    private void showFlowPane() throws IOException {
        showViews("flowpane.fxml", "Flow Pane View");

    }
    @FXML
    private void showGridPane() throws IOException {
showViews("gridpane-view.fxml", "Grid Pane View");
    }
    @FXML
    private void showBorderPane() throws IOException {
        showViews("borderpane-view.fxml","Border Pane View");
    }
    @FXML
    private void showHBox() throws IOException {
        showViews("hbox-view.fxml", "HBox View ");
    }
    @FXML
    private void showVBox() throws IOException {
        showViews("vbox-view.fxml", "V Box View");
    }

    private void showViews(String fxmlID, String stageTitle) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource(fxmlID));
        Stage stage=new Stage();
        Scene scene=new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(stageTitle);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();

    }

}
