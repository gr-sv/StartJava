public class MyFirstGame {
	public static void main(String[] args) {
		int compNumber = 38;
		int myNumber = 52;

		if (0 <= myNumber && myNumber <= 100) {
			System.out.println("Играем!");
			System.out.println("Ваше число " + myNumber);

			if (myNumber > compNumber) {
				while (myNumber > compNumber) {
					System.out.println("Ваше число больше, чем число, которое загадал компьютер.");
					myNumber -= 1;
					System.out.println("Ваше число " + myNumber);
				}
			}

			if (myNumber < compNumber) {
				while (myNumber < compNumber) {
					System.out.println("Ваше число меньше, чем число, которое загадал компьютер.");
					myNumber += 1;
					System.out.println("Ваше число " + myNumber);
				}
			}

			if (myNumber == compNumber) {
				System.out.println("Вы выиграли!");
			}

		} else {
			System.out.println("Пожалуйста, введите число от 0 до 100.");
		}
	}
}