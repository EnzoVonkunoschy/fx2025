package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Main3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear input
        TextField input = new TextField();
        input.setText("");
        // Crear input 2
        TextField inpu = new TextField();
        inpu.setText("");
        // Crear input 3
        TextField inputacion = new TextField();
        inpu.setText("");
        // Crear un botón
        Button boton = new Button("<-->");
        boton.setOnAction(e->{
            if(!input.getText().isEmpty()){//metodo de Java que se usa para saber si un String esta vacio
                String texto1 = input.getText();
                inpu.setText(texto1);
                input.clear();
            }else if(!inpu.getText().isEmpty()) {
                String texto3 = inpu.getText();
                input.setText(texto3);
                inpu.clear();
            }
        });

        // Crear un botón 2
        Button boto = new Button("<-->");
        boto.setOnAction(e->{
            if (!inpu.getText().isEmpty()){
                String texto2 = inpu.getText();
                inputacion.setText(texto2);
                inpu.clear();
            }else if(!inputacion.getText().isEmpty()){
                String texto3 = inputacion.getText();
                inpu.setText(texto3);
                inputacion.clear();
            }

        });
        // Crear layout y agregar
        HBox layout = new HBox(10);
        layout.getChildren().addAll(input,boton,inpu,boto,inputacion);


        // Crear escena con el layout
        Scene escena = new Scene(layout, 300, 200);

        // Configurar ventana
        primaryStage.setTitle("la ventana de los nebros");
        primaryStage.setScene(escena); // importante
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
