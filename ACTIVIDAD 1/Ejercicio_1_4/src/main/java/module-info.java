module com.joctan.ejercicio_1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio_1_4 to javafx.fxml;
    exports com.joctan.ejercicio_1_4;
}
