package com.example.secuencia1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;




public class HelloApplication extends Application {




    @Override
    public void start(Stage stage) {
        TextField leftField = new TextField();
        TextField middleField = new TextField();
        TextField rightField = new TextField();




        Button btnLeftMiddle = new Button("<--->");
        Button btnMiddleRight = new Button("<--->");




        updateButtonStyle(btnLeftMiddle, leftField.getText(), middleField.getText());
        updateButtonStyle(btnMiddleRight, middleField.getText(), rightField.getText());




        leftField.textProperty().addListener((obs, oldVal, newVal) ->
                updateButtonStyle(btnLeftMiddle, newVal, middleField.getText()));
        middleField.textProperty().addListener((obs, oldVal, newVal) -> {
            updateButtonStyle(btnLeftMiddle, leftField.getText(), newVal);
            updateButtonStyle(btnMiddleRight, newVal, rightField.getText());
        });
        rightField.textProperty().addListener((obs, oldVal, newVal) ->
                updateButtonStyle(btnMiddleRight, middleField.getText(), newVal));




        btnLeftMiddle.setOnAction(e -> {
            if (!leftField.getText().isEmpty() && middleField.getText().isEmpty()) {
                middleField.setText(leftField.getText());
                leftField.clear();
            } else if (leftField.getText().isEmpty() && !middleField.getText().isEmpty()) {
                leftField.setText(middleField.getText());
                middleField.clear();
            }
        });


        btnMiddleRight.setOnAction(e -> {
            if (middleField.getText().isEmpty() && rightField.getText().isEmpty()) {
                middleField.setText(rightField.getText());
                middleField.clear();
            } else if (middleField.getText().isEmpty() && !rightField.getText().isEmpty()) {
                rightField.setText(middleField.getText());
                rightField.clear();
            }
        });




        HBox root = new HBox(10, leftField, btnLeftMiddle, middleField, btnMiddleRight, rightField);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 700, 100);
        stage.setTitle("Pasatexto");
        stage.setScene(scene);
        stage.show();
    }




    private void updateButtonStyle(Button button, String sourceText, String targetText) {
        if (!sourceText.isEmpty() && targetText.isEmpty()) {
            button.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        } else if (sourceText.isEmpty() && !targetText.isEmpty()) {
            button.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        } else {
            button.setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        }
    }




    public static void main(String[] args) {launch();}}