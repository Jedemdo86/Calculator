package com.github.jedemdo86.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {

    private String operator;

    // Button sollen String aufbauen. Klick auf 1 fügt "1" dem String hinzu
    private String input = "";


    @FXML
    private Label inputText;

    @FXML
    protected void onHelloButtonClick() {

        inputText.setText(Operators.deconstruct(input));
    }

    @FXML
    protected void onOneButtonClick() {
        input = input+1;
        inputText.setText(input);
    }

    @FXML
    protected void onTwoButtonClick() {
        input = input+2;
        inputText.setText(input);
    }

    @FXML
    protected void onThreeButtonClick() {
        input = input+3;
        inputText.setText(input);
    }

    @FXML
    protected void onFourButtonClick() {
        input = input+4;
        inputText.setText(input);
    }

    @FXML
    protected void onFiveButtonClick() {
        input = input+5;
        inputText.setText(input);
    }

    @FXML
    protected void onSixButtonClick() {
        input = input+6;
        inputText.setText(input);
    }

    @FXML
    protected void onSevenButtonClick() {
        input = input+7;
        inputText.setText(input);
    }

    @FXML
    protected void onEightButtonClick() {
        input = input+8;
        inputText.setText(input);
    }

    @FXML
    protected void onNineButtonClick() {
        input = input+9;
        inputText.setText(input);
    }

    @FXML
    protected void onZeroButtonClick() {
        input = input+0;
        inputText.setText(input);
    }

    @FXML
    protected void onPlusButtonClick() {
        input = input +"+";
        inputText.setText(input);
    }

    @FXML
    protected void onMinusButtonClick() {
        input = input +"-";
        inputText.setText(input);
    }

    @FXML
    protected void onMultiButtonClick() {
        input = input +"*";
        inputText.setText(input);
    }

    @FXML
    protected void onDivButtonClick() {
        input = input +"/";
        inputText.setText(input);
    }

    @FXML
    protected void onClearButtonClick() {
        input = "";
        inputText.setText(input);
    }
}
