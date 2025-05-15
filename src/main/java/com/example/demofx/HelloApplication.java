package com.example.demo3;

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

        leftField.textProperty().addListener((obs, oldVal, newVal) ->
                updateButtonStyle(btnLeftMiddle, newVal, middleField.getText()));
        middleField.textProperty().addListener((obs, oldVal, newVal) -> {
            updateButtonStyle(btnLeftMiddle, leftField.getText(), newVal);
            updateButtonStyle(btnMiddleRight, newVal, rightField.getText());
        });
        rightField.textProperty().addListener((obs, oldVal, newVal) ->
                updateButtonStyle(btnMiddleRight, middleField.getText(), newVal));

        btnLeftMiddle.setOnAction(e -> {
            swapOrMove(leftField, middleField);
            updateButtonStyle(btnLeftMiddle, leftField.getText(), middleField.getText());
        });

        btnMiddleRight.setOnAction(e -> {
            swapOrMove(middleField, rightField);
            updateButtonStyle(btnMiddleRight, middleField.getText(), rightField.getText());
        });

        HBox root = new HBox(10, leftField, btnLeftMiddle, middleField, btnMiddleRight, rightField);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 700, 100);
        stage.setTitle("Pasatexto");
        stage.setScene(scene);
        stage.show();
    }

    private void swapOrMove(TextField a, TextField b) {
        String textA = a.getText();
        String textB = b.getText();

        if (!textA.isEmpty() && textB.isEmpty()) {
            b.setText(textA);
            a.clear();
        } else if (textA.isEmpty() && !textB.isEmpty()) {
            a.setText(textB);
            b.clear();
        } else if (!textA.isEmpty() && !textB.isEmpty()) {
            a.setText(textB);
            b.setText(textA);
        }
    }

    private void updateButtonStyle(Button button, String sourceText, String targetText) {
        if (!sourceText.isEmpty() && targetText.isEmpty()) {

        } else if (sourceText.isEmpty() && !targetText.isEmpty()) {
            button.setStyle("");
        } else if (!sourceText.isEmpty() && !targetText.isEmpty()) {
            button.setStyle("");
        } else {
            button.setStyle("");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}