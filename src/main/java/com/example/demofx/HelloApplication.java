package com.example.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hell4o-view.fxml"));

        Group controles = new Group();





        Button btn1 = new Button("<--->");
        btn1.setLayoutX(220);
        btn1.setLayoutY(100);
        btn1.setPrefWidth(60);

        Button btn2 = new Button("<--->");
        btn2.setLayoutX(470);
        btn2.setLayoutY(100);
        btn2.setPrefWidth(60);

        TextField text1 = new TextField();
        text1.setLayoutX(50);
        text1.setLayoutY(100);
        text1.setPrefWidth(150);

        TextField text2 = new TextField();
        text2.setLayoutX(300);
        text2.setLayoutY(100);
        text2.setPrefWidth(150);


        TextField text3 = new TextField();
        text3.setLayoutX(550);
        text3.setLayoutY(100);
        text3.setPrefWidth(150);



        btn1.setOnAction(e -> {
            String temp = text1.getText();
            String temp2 = text2.getText();
            text1.setText(temp2);
            text2.setText(temp);
        });

        btn2.setOnAction(e -> {
            String temp3 = text2.getText();
            String temp4 = text3.getText();
            text2.setText(temp4);
            text3.setText(temp3);
        });


        controles.getChildren().addAll(text1, btn1, text2, text3, btn2);


        Scene scene = new Scene(controles, 750, 550);

        stage.setTitle("Pasatexto");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
