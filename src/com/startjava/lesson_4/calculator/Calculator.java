package com.startjava.lesson_4.calculator;

public class Calculator {
    private String expression;
    private int a;
    private int b;
    private char sign;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int calculate() {
        String[] parts = expression.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[2]);
        sign = expression.charAt(2);

        switch(sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return (int) Math.IEEEremainder(a, b);
            case '^':
                return (int) Math.pow(a, b);
            default:
                System.out.println("Oops! Unknown operation!");
        }
    }
}

