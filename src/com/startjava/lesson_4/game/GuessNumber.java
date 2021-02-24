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
            player1.setNumber(sc.nextInt());

            numbers1 = player1.getNumbers();
            numbers1[i] = player1.getNumber();

            numbers1 = Arrays.copyOf(numbers1, (i + 1));

            if (player1.getNumber() > secretNumber) {
                System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player1.getNumber() < secretNumber) {
                System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player1.getNumber() == secretNumber) {
                System.out.println(player1.getName() + ", You win!!!");
                System.out.println("Игрок " + player1.getName() + " угадал число с " + (i + 1) + " попытки");
                break;
            }

            if (i == (player1.getNumbers().length - 1)) {
                System.out.println("Игрок " + player1.getName() + ", Ваши попытки закончились.");
            }

            System.out.println(player2.getName() + ", загадайте число  от 1 до 100:");
            player2.setNumber(sc.nextInt());

            numbers2 = player2.getNumbers();
            numbers2[i] = player2.getNumber();

            numbers2 = Arrays.copyOf(numbers2, (i + 1));

            if (player2.getNumber() > secretNumber) {
                System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player2.getNumber() < secretNumber) {
                System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
            } else if (player2.getNumber() == secretNumber) {
                System.out.println(player2.getName() + ", You win!!!");
                System.out.println("Игрок " + player2.getName() + " угадал число с " + (i + 1) + " попытки");
                break;
            }

            if (i == (player1.getNumbers().length - 1)) {
                System.out.println("Игрок " + player2.getName() + ", Ваши попытки закончились.");
            }
        }
        System.out.println("Игрок " + player1.getName() + ": " + Arrays.toString(numbers1));
        System.out.println("Игрок " + player2.getName() + ": " + Arrays.toString(numbers2));
    }

    public void resetOfNumbers() {
        Arrays.fill(numbers1,0);
        Arrays.fill(numbers2, 0);
        System.out.println("Игрок " + player1.getName() + ": " + Arrays.toString(numbers1));
        System.out.println("Игрок " + player2.getName() + ": " + Arrays.toString(numbers2));
    }
}