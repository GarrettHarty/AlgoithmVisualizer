module com.example.algoithmvisualizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.algoithmvisualizer to javafx.fxml;
    exports com.example.algoithmvisualizer;
}