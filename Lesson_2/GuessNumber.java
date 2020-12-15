public class GuessNumber {
	private int compNumber;
	private int myNumber;

	public GuessNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public int getCompNumber() {
		return compNumber;
	}

	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

	public void Game() {
		if (myNumber > compNumber) {
			System.out.println("Ваше число " + myNumber + " больше, чем число, которое загадал компьютер. Попробуйте еще раз.");
		}
		if (myNumber < compNumber) {
			System.out.println("Ваше число " + myNumber + " меньше, чем число, которое загадал компьютер. Попробуйте еще раз.");
		}
	}
}