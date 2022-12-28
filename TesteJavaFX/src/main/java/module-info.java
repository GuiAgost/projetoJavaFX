module com.example.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens basico to javafx.fxml;
    opens layout to javafx.fxml;
    opens fxml to javafx.fxml;
    opens calculadora to javafx.fxml;
//    opens calculadora to javafx.fxml;
    exports basico;
    exports layout;
    exports fxml;
    exports calculadora;
}