package com.calculator.build_calculator_using_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button AdditionButton;
    @FXML
    private Label CalculateTheValue;
    @FXML
    private ImageView CloseButton;
    @FXML
    private Button DivideButton;
    @FXML
    private Button EightButton;
    @FXML
    private Button FIveButton1;

    @FXML
    private Button FourButton1;
    @FXML
    private Button ZeroButton;
    @FXML
    private ImageView MinimixeButton;

    @FXML
    private Button ModulusButton;

    @FXML
    private Button MultiplicationButton;

    @FXML
    private Button NIneButton;
    @FXML
    private Button EqualToButton;
    @FXML
    private Button OneButton11;
    @FXML
    private Button TwoButton11;
    @FXML
    private Label ResultValue;

    @FXML
    private Button SevenButton;

    @FXML
    private Button SixButton1;

    @FXML
    private Button SubrationButton;

    @FXML
    private ImageView ClearButton;
    @FXML
    private Button ThreeButton11;

    @FXML
    void NumberHandler(ActionEvent event) {
        if (event.getSource() == OneButton11) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "1");

        } else if (event.getSource() == TwoButton11) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "2");

        } else if (event.getSource() == ThreeButton11) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "3");

        } else if (event.getSource() == FourButton1) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "4");

        } else if (event.getSource() == FIveButton1) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "5");

        } else if (event.getSource() == SixButton1) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "6");

        } else if (event.getSource() == SevenButton) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "7");

        } else if (event.getSource() == EightButton) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "8");

        }
        if (event.getSource() == NIneButton) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "9");

        } else if (event.getSource() == ZeroButton) {
            CalculateTheValue.setText(CalculateTheValue.getText() + "0");
        } else if (event.getSource() == ClearButton) {
            CalculateTheValue.setText("");
        }
    }
    double ResultVariable=0;
    @FXML
    void OpertationHandler(ActionEvent event) {
        if(event.getSource()==AdditionButton)
        {
            ResultVariable+=Integer.parseInt(CalculateTheValue.getText());
            CalculateTheValue.setText("");
            ResultValue.setText(String.valueOf(ResultVariable));
        } else if (event.getSource()==SubrationButton) {
            ResultVariable-=Integer.parseInt(CalculateTheValue.getText());
            CalculateTheValue.setText("");
            ResultValue.setText(String.valueOf(ResultVariable));
        } else if (event.getSource()==MultiplicationButton) {
            ResultVariable*=Integer.parseInt(CalculateTheValue.getText());
            CalculateTheValue.setText("");
            ResultValue.setText(String.valueOf(ResultVariable));
        }
        else if(event.getSource()==DivideButton)
        {
            ResultVariable/=Integer.parseInt(CalculateTheValue.getText());
            CalculateTheValue.setText("");
            ResultValue.setText(String.valueOf(ResultVariable));
        }
        else if(event.getSource()==EqualToButton)
        {
            ResultVariable+=Double.parseDouble(CalculateTheValue.getText());
            ResultValue.setText(String.valueOf(ResultVariable));
            CalculateTheValue.setText("");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CloseButton.setOnMouseClicked(event -> System.exit(0));
        ClearButton.setOnMouseClicked(event -> {
                    ResultVariable = 0;
                    ResultValue.setText("0.00");
                }
        );
    }
}