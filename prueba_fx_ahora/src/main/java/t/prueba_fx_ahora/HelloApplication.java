package t.prueba_fx_ahora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage escenario) {
        TextField campoIzquierdo = new TextField();
        TextField campoDerecho1 = new TextField();
        TextField campoDerecho2 = new TextField();

        Button botonMoverADerecha1 = new Button("<--->");
        Button botonMoverADerecha2 = new Button("<--->");

        botonMoverADerecha1.setOnAction(e -> {
            String almacen = campoDerecho1.getText();
            campoDerecho1.setText(campoIzquierdo.getText());
            campoIzquierdo.setText(almacen);
        });

        botonMoverADerecha2.setOnAction(e -> {
            String a;
            a= campoDerecho2.getText();
            campoDerecho2.setText(campoDerecho1.getText());
            campoDerecho1.setText(a);
        });

        HBox contenedor = new HBox(10, campoIzquierdo, botonMoverADerecha1, campoDerecho1, botonMoverADerecha2, campoDerecho2);
        contenedor.setAlignment(Pos.CENTER);

        Scene escena = new Scene(contenedor, 600, 100);
        escenario.setTitle("Pasatexto");
        escenario.setScene(escena);
        escenario.show();
    }

    public static void main(String[] args) {
        launch();
    }

}