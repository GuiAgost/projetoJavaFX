module com.example.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens basico to javafx.fxml;
    opens layout to javafx.fxml;
    exports basico;
    exports layout;
}