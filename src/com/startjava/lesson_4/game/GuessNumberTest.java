package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока.");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Введите имя второго игрока.");
        Player player2 = new Player(sc.nextLine());

        String playerAnswer;

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                playerAnswer = sc.nextLine();
                if (playerAnswer.equals("yes")) {
                    game.resetOfNumbers();
                }
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
        System.out.println("The end.");
    }
}
