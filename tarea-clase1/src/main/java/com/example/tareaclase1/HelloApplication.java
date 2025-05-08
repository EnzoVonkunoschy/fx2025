package com.example.tareaclase1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group controles=new Group();

        final TextField prim=new TextField();
        final TextField sec=new TextField();
        final TextField terc=new TextField();

        final Button btn=new Button();
        btn.setText("<-->");
        btn.setOnAction(actionEvent -> {
            cambiodecampod(sec,terc);
        });
        final Button sbtn=new Button();
        sbtn.setText("<-->");
        sbtn.setOnAction(actionEvent -> {
            cambiodecampo(prim,sec);
        });
        HBox orde=new HBox(10,terc,btn,sec,sbtn,prim);
        controles.getChildren().add(orde);

        Scene pscena= new Scene(controles,1080,360);
        stage.setTitle("cambio de campo");
        stage.setScene(pscena);
        stage.show();
    }
    private void cambiodecampo(TextField prim,TextField sec) {
        String var1=prim.getText();
        prim.setText(sec.getText());
        sec.setText(var1);
    }
    private void cambiodecampod(TextField sec,TextField terc) {
        String var1=sec.getText();
        sec.setText(terc.getText());
        terc.setText(var1);

    }

    public static void main(String[] args) {
        launch();
    }
}