package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    private int secretNumber;
    private Player player1;
    private Player player2;
    int[] numbers1;
    int[] numbers2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Компьютер загадал число. Попробуйте его угадать. У Вас 10 попыток.");
        secretNumber = random.nextInt(100) + 1;

        for(int i = 0; i < player1.getNumbers().length; i++) {
            System.out.println(player1.getName() + ", загадайте число от 1 до 100:");

            player1.setNumbers(i, sc.nextInt());
            System.out.println("Игрок1 число i: " + player1.getNumbers()[i]); // проверка числа

            numbers1 = Arrays.copyOf(player1.getNumbers(), (i + 1));
            System.out.println("Игрок1 массив: " + Arrays.toString(numbers1)); // проверка массива

            if (player1.getNumbers()[i] > secretNumber) {
                System.out.println(player1.getName() + ", Ваше число " + player1.getNumbers()[i] + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player1.getNumbers()[i] < secretNumber) {
                System.out.println(player1.getName() + ", Ваше число " + player1.getNumbers()[i] + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player1.getNumbers()[i] == secretNumber) {
                System.out.println(player1.getName() + ", You win!!!");
                System.out.println("Игрок " + player1.getName() + " угадал число с " + (i + 1) + " попытки");
                break;
            }

            if (i == (player1.getNumbers().length - 1)) {
                System.out.println("Игрок " + player1.getName() + ", Ваши попытки закончились.");
            }

            System.out.println(player2.getName() + ", загадайте число  от 1 до 100:");

            player2.setNumbers(i, sc.nextInt());
            System.out.println("Игрок2 число i: " + player2.getNumbers()[i]); // проверка числа

            numbers2 = Arrays.copyOf(player2.getNumbers(), (i + 1));
            System.out.println("Игрок2 массив: " + Arrays.toString(numbers2)); // проверка массива

            if (player2.getNumbers()[i] > secretNumber) {
                System.out.println(player2.getName() + ", Ваше число " + player2.getNumbers()[i] + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player2.getNumbers()[i] < secretNumber) {
                System.out.println(player2.getName() + ", Ваше число " + player2.getNumbers()[i] + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player2.getNumbers()[i] == secretNumber) {
                System.out.println(player2.getName() + ", You win!!!");
                System.out.println("Игрок " + player2.getName() + " угадал число с " + (i + 1) + " попытки");
                break;
            }

            if (i == (player1.getNumbers().length - 1)) {
                System.out.println("Игрок " + player2.getName() + ", Ваши попытки закончились.");
            }
        }

        System.out.print("Игрок " + player1.getName() + ": ");
        for (int i : numbers1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Игрок " + player2.getName() + ": ");
        for (int i : numbers2) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.fill(numbers1,0);
        Arrays.fill(numbers2, 0);

        // проверка обнуления массива:
        System.out.println("Игрок1: " + Arrays.toString(numbers1));
        System.out.println("Игрок2: " + Arrays.toString(numbers2));
    }
}