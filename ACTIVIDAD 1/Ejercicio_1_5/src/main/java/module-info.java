module com.joctan.ejercicio_1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio_1_5 to javafx.fxml;
    exports com.joctan.ejercicio_1_5;
}
