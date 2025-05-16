package com.example.demofx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group controles = new Group();

        final Button btn0 = new Button();
        btn0.setText("<->");
        btn0.setLayoutX(155);
        btn0.setLayoutY(10);
        final Button btn1 = new Button();
        btn1.setText("<->");
        btn1.setLayoutX(355);
        btn1.setLayoutY(10);


        TextField text0 = new TextField();
        text0.setText("");
        text0.setLayoutY(10);
        TextField text1 = new TextField();
        text1.setText("");
        text1.setLayoutX(200);
        text1.setLayoutY(10);
        TextField text2 = new TextField();
        text2.setText("");
        text2.setLayoutX(400);
        text2.setLayoutY(10);


        btn0.setOnAction(e -> {

            String inv0 = text0.getText();
            String inv1 = text1.getText();
            text1.setText(inv0);
            text0.setText(inv1);
        });
        btn1.setOnAction(e -> {
            String inv2 = text1.getText();
            String inv3 = text2.getText();
            text1.setText(inv3);
            text2.setText(inv2);
        });


        controles.getChildren().add(btn0);
        controles.getChildren().add(btn1);
        controles.getChildren().add(text0);
        controles.getChildren().add(text1);
        controles.getChildren().add(text2);



        Scene scene = new Scene(controles, 640, 480);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



