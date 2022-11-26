package com.example.eventhandling;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class ImageViewExample {
    double degree=0;
    Image image;
    @FXML
    ImageView imageView;
    @FXML
    private void showImage()
    {

        File file=new File("images/wp3202677.jpg");
        if (file.exists()) {
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
        else {
            System.out.println("Image does not exist ");
        }
    }
    @FXML
    private void rotateImage(){

    }


}
