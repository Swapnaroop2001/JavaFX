module com.example.javafxlearnings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxlearnings to javafx.fxml;
    exports com.example.javafxlearnings;
}