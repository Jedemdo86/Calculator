module com.github.jedemdo86.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.jedemdo86.calculator to javafx.fxml;
    exports com.github.jedemdo86.calculator;
}