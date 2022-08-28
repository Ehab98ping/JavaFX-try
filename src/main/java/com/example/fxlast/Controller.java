package com.example.fxlast;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField TF1;

    @FXML
    ImageView imgView1;
    Image img1=new Image("img1.jpg");
    Image img2=new Image("img2.jpg");
    //@FXML
    //protected void Click() {welcomeText.setText("Welcome");

    public void toScene2(ActionEvent event) throws IOException {
        String s=TF1.getText();

        FXMLLoader loader=new FXMLLoader(getClass().getResource("scene2.fxml"));
        root=loader.load();
        Controler2 con2=loader.getController();
        con2.displayLA(s);

        stage=(Stage)(((Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchImage1(){
        imgView1.setImage(img1);
    }
    public void switchImage2(){
        imgView1.setImage(img2);
    }





}