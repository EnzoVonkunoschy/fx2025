package com.example.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {


        final Button btn = new Button("<--->");
        btn.setPrefWidth(50);

        final Button btn2 = new Button("<--->");
        btn2.setPrefWidth(50);

        TextArea text_01 = new TextArea("   ");
        text_01.setPrefSize(200, 30);
        text_01.setMaxHeight(30);
        text_01.setMinHeight(30);

        TextArea text_02 = new TextArea("   ");
        text_02.setPrefSize(200, 30);
        text_02.setMaxHeight(30);
        text_02.setMinHeight(30);

        TextArea text_03 = new TextArea("   ");
        text_03.setPrefSize(200,30 );
        text_03.setMaxHeight(30);
        text_03.setMinHeight(30);

        HBox controles = new HBox(10);
        controles.getChildren().addAll(text_01, btn, text_02, btn2, text_03);


        btn.setOnAction(e -> {
            String temp = text_01.getText();
            text_01.setText(text_02.getText());
            text_02.setText(temp);
        });

        btn2.setOnAction(e -> {
            String temp = text_02.getText();
            text_02.setText(text_03.getText());
            text_03.setText(temp);
        });


        Scene scene = new Scene(controles, 800, 480);

        stage.setTitle("Pasa texto");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



