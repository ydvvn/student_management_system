module com.example.topic7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.topic7 to javafx.fxml;
    exports com.example.topic7;
}