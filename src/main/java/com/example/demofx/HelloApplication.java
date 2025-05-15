package com.example.demofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Group controles = new Group();
        final Button btn = new Button("<--->");
        final Button btn2 = new Button("<--->");
        btn.setLayoutX(150);
        btn2.setLayoutX(350);
        final TextField text1 = new TextField();
        final TextField text2 = new TextField();
        final TextField text3 = new TextField();
        text2.setLayoutX(200);
        text3.setLayoutX(400);
        controles.getChildren().add(btn);
        controles.getChildren().add(btn2);
        controles.getChildren().add(text1);
        controles.getChildren().add(text2);
        controles.getChildren().add(text3);
        btn.setOnAction(actionEvent -> {
            String s1 = text1.getText();
            String s2 = text2.getText();
            String aux;
            if (!s2.isEmpty() || !s1.isEmpty()){
                aux = s1;
                s1 = s2;
                s2 = aux;
                text1.setText(s1);
                text2.setText(s2);
            }
        });
        btn2.setOnAction(actionEvent -> {
            String s2 = text2.getText();
            String s3 = text3.getText();
            String aux;
            if (!s3.isEmpty() || !s2.isEmpty()){
                aux = s2;
                s2 = s3;
                s3 = aux;
                text2.setText(s2);
                text3.setText(s3);
            }
        });
        Scene scene = new Scene(controles, 640, 480);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}



