package com.startjava.lesson_4.calculator;

public class Calculator {
    private String expression;
    private int a;
    private int b;
    private char sign;
    private int result;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public char getSign() {
        return sign;
    }

    public int getResult() {
        return result;
    }

    public int calculate() {
        String[] parts = expression.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[2]);
        sign = expression.charAt(2);

        switch(sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = (int) Math.IEEEremainder(a, b);
                break;
            case '^':
                result = (int) Math.pow(a, b);
                break;
            default:
                System.out.println("Oops! Unknown operation!");
                break;
        }
        return result;
    }
}

