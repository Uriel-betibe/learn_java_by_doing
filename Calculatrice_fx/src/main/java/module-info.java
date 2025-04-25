module com.example.calculatrice_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatrice_fx to javafx.fxml;
    exports com.example.calculatrice_fx;
}