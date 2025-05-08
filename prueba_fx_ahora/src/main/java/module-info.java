module t.prueba_fx_ahora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens t.prueba_fx_ahora to javafx.fxml;
    exports t.prueba_fx_ahora;
}