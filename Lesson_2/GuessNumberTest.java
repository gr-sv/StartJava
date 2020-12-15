import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String userAnswer;

		System.out.println("Введите имя первого игрока.");
		Player player1 = new Player(sc.nextLine());

		System.out.println("Введите имя второго игрока.");
		Player player2 = new Player(sc.nextLine());

		do {
			System.out.println("Компьютер загадал число. Попробуйте его угадать.");
			GuessNumber gameStart = new GuessNumber(random.nextInt(100) + 1);

			do {
				System.out.println(player1.getName() + " загадайте число от 1 до 100:");
				player1.setMyNumber(sc.nextInt());

				System.out.println(player2.getName() + " загадайте число  от 1 до 100:");
				player2.setMyNumber(sc.nextInt());

				gameStart.setMyNumber(player1.getMyNumber());
				System.out.println(player1.getName());
				gameStart.Game();

				gameStart.setMyNumber(player2.getMyNumber());
				System.out.println(player2.getName());
				gameStart.Game();

			} while (player1.getMyNumber() != gameStart.getCompNumber() && player2.getMyNumber() != gameStart.getCompNumber());

			if (player1.getMyNumber() == gameStart.getCompNumber()) {
				System.out.println(player1.getName() + ", поздравляем! Вы выиграли!!!");
			} else if (player2.getMyNumber() == gameStart.getCompNumber()) {
				System.out.println(player2.getName() + ", поздравляем! Вы выиграли!!!");
			}
			sc.nextLine();

			do {
				System.out.println("Хотите продолжить игру? [да/нет]");
				userAnswer = sc.nextLine();
			} while (!userAnswer.equals("да") && !userAnswer.equals("нет"));
		} while (userAnswer.equals("да"));

		System.out.println("The end.");
	}
}