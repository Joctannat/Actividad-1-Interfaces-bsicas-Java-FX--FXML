module com.joctan.ejercicio_1_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio_1_2 to javafx.fxml;
    exports com.joctan.ejercicio_1_2;
}
