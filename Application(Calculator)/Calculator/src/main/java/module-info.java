module zeeshan.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens zeeshan.calculator to javafx.fxml;
    exports zeeshan.calculator;
}