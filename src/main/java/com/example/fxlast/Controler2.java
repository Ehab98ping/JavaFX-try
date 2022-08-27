package com.example.fxlast;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controler2 {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label welcomeLA;

    @FXML
    private AnchorPane scene2;
    //@FXML
    //protected void Click() {welcomeText.setText("Welcome");

    public void toScene1(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("view.fxml"));
        stage=(Stage)(((Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public void displayLA(String s){
        welcomeLA.setText("hello "+s);
    }
    public void exit(ActionEvent event){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setContentText("Are you sure you will exit ?");
        if(alert.showAndWait().get()== ButtonType.OK) {
            stage = (Stage) scene2.getScene().getWindow();
            stage.close();
        }
    }
}