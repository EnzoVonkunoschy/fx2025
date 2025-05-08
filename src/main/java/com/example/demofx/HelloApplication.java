package com.example.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.File;

import java.io.IOException;

public class HelloApplication extends Application {

    private String texto1, texto2;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group controles = new Group();

        //botones
        final Button btn = new Button();
        btn.setLayoutX(390);
        btn.setLayoutY(10);
        btn.setPrefWidth(50);
        btn.setText("<--->");

        final Button btn2 = new Button();
        btn2.setLayoutX(170);
        btn2.setLayoutY(10);
        btn2.setPrefWidth(50);
        btn2.setText("<--->");

        //creacion de los textfield :b
        final TextField field1 = new TextField();
        field1.setPrefWidth(150);
        field1.setLayoutY(10);
        field1.setLayoutX(10);

        final TextField field2 = new TextField();
        field2.setPrefWidth(150);
        field2.setLayoutY(10);
        field2.setLayoutX(230);


        final TextField field3 = new TextField();
        field3.setPrefWidth(150);
        field3.setLayoutY(10);
        field3.setLayoutX(450);

        //evento
        btn.setOnAction(e ->{

            texto1 = field2.getText();
            texto2 = field3.getText();

            field3.setText(texto1);
            field2.setText(texto2);

                });

        btn2.setOnAction(e ->{

            texto1 = field1.getText();
            texto2 = field2.getText();

            field1.setText(texto2);
            field2.setText(texto1);
        });
        String laburo2 = "https://media1.tenor.com/m/XzQkQbkb_j0AAAAd/laburo.gif";
        Image laburo = new Image(laburo2);
        ImageView imageverxd = new ImageView(laburo);
        imageverxd.setPreserveRatio(true);
        imageverxd.setLayoutX(110);
        imageverxd.setLayoutY(110);



        controles.getChildren().add(btn);
        controles.getChildren().add(btn2);
        controles.getChildren().add(field3);
        controles.getChildren().add(field2);
        controles.getChildren().add(field1);
        controles.getChildren().add(imageverxd);

        Scene scene = new Scene(controles, 610, 480);

        stage.setTitle("El swap del papu");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



