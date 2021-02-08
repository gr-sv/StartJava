package com.startjava.lesson_4.calculator;

public class Calculator {
    private String expression;
    private int a;
    private int b;
    private char sign;
    private int result;

    char[] signs = {'+', '-', '*', '/', '%', '^'};

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

    public int calculate() {
        String[] part = expression.split("");
        a = Integer.parseInt(part[0]);
        b = Integer.parseInt(part[2]);
        sign = expression.charAt(1);

        if (sign == signs[0]) {
            result = a + b;
        } else if (sign == signs[1]) {
            result = a - b;
        } else if (sign == signs[2]) {
            result = a * b;
        } else if (sign == signs[3]) {
            result = a / b;
        } else if(sign == signs[4]) {
            result = (int) Math.IEEEremainder(a, b);
        } else if(sign == signs[5]) {
            result = (int) Math.pow(a, b);
        }
        return result;
    }
}

