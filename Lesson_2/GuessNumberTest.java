import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String playerAnswer;

		do{
			GuessNumber game = new GuessNumber();

			game.play();

			do{
				System.out.println("Хотите продолжить игру? [yes/no]");
				playerAnswer = sc.nextLine();
			} while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
		} while (playerAnswer.equals("yes"));
		System.out.println("The end.");
	}
}