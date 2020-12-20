import java.util.Scanner;

public class GuessNumber {
	Scanner sc = new Scanner(System.in);

	private String player1;
	private String player2;
	private int compNumber;
	private int number1;
	private int number2;

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public GuessNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void Game() {
		do{
			System.out.println(player1 + ", загадайте число от 1 до 100:");
			number1 = sc.nextInt();

			System.out.println(player2 + ", загадайте число  от 1 до 100:");
			number2 = sc.nextInt();

			if (number1 > compNumber) {
				System.out.println(player1 + ", Ваше число " + number1 + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			}
			if (number1 < compNumber) {
				System.out.println(player1 + ", Ваше число " + number1 + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			}
			if (number2 > compNumber) {
				System.out.println(player2 + ", Ваше число " + number2 + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			}
			if (number2 < compNumber) {
				System.out.println(player2 + ", Ваше число " + number2 + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			}
		} while (number1 != compNumber && number2 != compNumber);

		if (number1 == compNumber) {
			System.out.println(player1 + ", You win!!!");
		} else if (number2 == compNumber) {
			System.out.println(player2 + ", You win!!!");
		}
	}
}