public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 35;
		if (age > 20) {
			System.out.println("Adult");
		}

		boolean male = true;
		if (male == true) {
			System.out.println("Man");
		}

		if (!male == true) {
			System.out.println("Woman");
		}

		float height = 1.84f;
		if (height < 1.80) {
			System.out.println("Medium height");
		} else {
			System.out.println("Tall guy");
		}

		char firstLetterOfName = 'S';
		if (firstLetterOfName == 'M') {
			System.out.println("Perhaps your name is Michael.");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Perhaps your name is Ivan.");
		} else {
			System.out.println("I have no idea. What's your name?");
		}
	}
}