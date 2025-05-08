package com.example.demofx;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        TextField campo1 = new TextField();
        TextField campo2 = new TextField();
        TextField campo3 = new TextField();


        //botones
        Button btn1 = new Button("<-->");
        Button btn2 = new Button("<-->");


        //Acción del primer boton  (nuevo campo1 a campo2)
        btn1.setOnAction((e ->{
            String temp = campo1.getText();
            campo1.setText(campo2.getText());
            campo2.setText(temp);

        }));

        //Accion del segundo boton(nuevo campo3 a campo4)
        btn2.setOnAction((e->{
            String temp = campo2.getText();
            campo2.setText((campo3.getText()));
            campo3.setText(temp);
        }));

        //layouts
        HBox file1 = new HBox(10, campo1, btn1, campo2, btn2, campo3);

        VBox layout = new VBox(15, file1);

        //configuracion final
        Scene scene = new Scene(layout, 750, 480);

        stage.setTitle("PasaTexto Flavia");
        stage.setScene(scene);
        stage.show();

       // Group controles = new Group();
       // final Button btn = new Button();
        //btn.setText("Hola Mundo fx");
        //controles.getChildren().add(btn);
        //Scene scene = new Scene(controles, 640, 480);
        //stage.setTitle("PasaTexto");
        //stage.setScene(scene);
        //stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



