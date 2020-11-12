public class Unicod {
	public static void main(String[] args) {
		int unicodNumber = 9398;
		while (unicodNumber <= 10178) {
			char unicodSymbol = (char) unicodNumber;
			System.out.println(unicodSymbol);
			unicodNumber++;
		}
	}
}