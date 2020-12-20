import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String userAnswer;

		System.out.println("Введите имя игока Player1.");
		Player player1 = new Player(sc.nextLine());

		System.out.println("Введите имя игрока Player2.");
		Player player2 = new Player(sc.nextLine());

		do {
			System.out.println("Компьютер загадал число. Попробуйте его угадать.");
			GuessNumber newGame = new GuessNumber(random.nextInt(100) + 1);

			newGame.setPlayer1(player1.getName());
			newGame.setPlayer2(player2.getName());

			newGame.setNumber1(player1.getNumber());
			newGame.setNumber2(player2.getNumber());

			newGame.Game();

			do {
				System.out.println("Хотите продолжить игру? [yes/no]");
				userAnswer = sc.nextLine();
			} while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
		} while (userAnswer.equals("yes"));
		System.out.println("The end.");
	}
}