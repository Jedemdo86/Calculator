package com.github.jedemdo86.calculator;

public class Operators {



    public static double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (a != 0 || b != 0) {
            return a / b;
        }
        return 0;
    }

    public static String deconstruct(String input) {

        char operator = ' ';
        int operatorIndex = -1;
        double ergebnis = 0;

        for (char op : new char[]{'+', '-', '*', '/'}) {
            int index = input.indexOf(op);
            if (index != -1) {
                operator = op;
                operatorIndex = index;
                break;
            }
        }
        double zahl1 = Integer.parseInt(input.substring(0, operatorIndex));
        double zahl2 = Integer.parseInt(input.substring(operatorIndex + 1));
        return calculate(operator, ergebnis, zahl1, zahl2);

    }

    private static String calculate(char operator, double ergebnis, double zahl1, double zahl2) {
        if (operator == '+') {
            ergebnis = zahl1 + zahl2;
        }
        else if (operator == '-') {
            ergebnis = zahl1 - zahl2;
        }
        else if (operator == '*') { //bla
            ergebnis = zahl1 * zahl2;
        }
        else if (operator == '/') {
            ergebnis = zahl1 / zahl2;
        }
        return (""+ergebnis);
    }
}
