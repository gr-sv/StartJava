import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String userAnswer;

		do {
			GuessNumber game = new GuessNumber(random.nextInt(100) + 1);

			game.play();

			do {
				System.out.println("Хотите продолжить игру? [yes/no]");
				userAnswer = sc.nextLine();
			} while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
		} while (userAnswer.equals("yes"));
		System.out.println("The end.");
	}
}