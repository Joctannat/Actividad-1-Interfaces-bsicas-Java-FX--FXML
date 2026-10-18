module com.joctan.ejercicio1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio1_3 to javafx.fxml;
    exports com.joctan.ejercicio1_3;
}
