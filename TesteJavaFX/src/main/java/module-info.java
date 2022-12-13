module com.example.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens basico to javafx.fxml;
    exports basico;
}