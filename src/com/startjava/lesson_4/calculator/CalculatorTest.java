package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String userAnswer;

        do {
            System.out.println("Введите математическое выражение: ");
            calc.setExpression(scan.nextLine());

            calc.calculate();
            System.out.println("Результат: " + calc.getA() + " " + calc.getSign() + " " + calc.getB() + " = " + calc.getResult());

            do {
                System.out.println("Хотите продолжить вычисления? [yes]/[no]");
                userAnswer = scan.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));

        System.out.println("The end!");
    }
}