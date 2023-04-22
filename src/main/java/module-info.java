module com.calculator.build_calculator_using_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.build_calculator_using_javafx to javafx.fxml;
    exports com.calculator.build_calculator_using_javafx;
}