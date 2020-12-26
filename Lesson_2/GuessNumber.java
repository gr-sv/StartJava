import java.util.Scanner;

public class GuessNumber {
	Scanner sc = new Scanner(System.in);

	private int compNumber;

	public GuessNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public void play() {
			System.out.println("Введите имя первого игрока.");
			Player player1 = new Player(sc.nextLine(), 0);

			System.out.println("Введите имя второго игрока.");
			Player player2 = new Player(sc.nextLine(), 0);

			System.out.println("Компьютер загадал число. Попробуйте его угадать.");

		do{
			System.out.println(player1.getName() + ", загадайте число от 1 до 100:");
			player1.setNumber(sc.nextInt());

			if (player1.getNumber() > compNumber) {
				System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player1.getNumber() < compNumber) {
				System.out.println(player1.getName() + ", Ваше число " + player1.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player1.getNumber() == compNumber) {
				System.out.println(player1.getName() + ", You win!!!");
				break;
			}

			System.out.println(player2.getName() + ", загадайте число  от 1 до 100:");
			player2.setNumber(sc.nextInt());

			if (player2.getNumber() > compNumber) {
				System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player2.getNumber() < compNumber) {
				System.out.println(player2.getName() + ", Ваше число " + player2.getNumber() + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
			} else if (player2.getNumber() == compNumber) {
				System.out.println(player2.getName() + ", You win!!!");
				break;
			}
		} while (player1.getNumber() != compNumber && player2.getNumber() != compNumber);
	}
}