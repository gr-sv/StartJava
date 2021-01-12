package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	private int secretNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте его угадать.");
		secretNumber = random.nextInt(100) + 1;

		while (true) {
			System.out.println(player1.getName() + ", загадайте число от 1 до 100:");
			player1.setNumber(sc.nextInt());

			if (player1.getNumber() > secretNumber) {
				System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player1.getNumber() < secretNumber) {
				System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player1.getNumber() == secretNumber) {
				System.out.println(player1.getName() + ", You win!!!");
				break;
			}

			System.out.println(player2.getName() + ", загадайте число  от 1 до 100:");
			player2.setNumber(sc.nextInt());

			if (player2.getNumber() > secretNumber) {
				System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player2.getNumber() < secretNumber) {
				System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player2.getNumber() == secretNumber) {
				System.out.println(player2.getName() + ", You win!!!");
				break;
			}
		}
	}
}