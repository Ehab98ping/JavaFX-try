package com.example.fxlast;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField TF1;
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





}