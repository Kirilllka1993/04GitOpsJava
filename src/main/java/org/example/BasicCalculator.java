package org.example;

public class BasicCalculator {

    public Double calculate(char op, double num1, double num2) {
        System.out.println("Hello Git 1");
        Double o = 0.0;
        switch (op) {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }
        return o;
    }
}
