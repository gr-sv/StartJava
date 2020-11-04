public class Calculator {
	public static void main(String[] args) {
		int a = 15;
		int b = 3;
		int result = 0;
		char c = '+';

		if (c == '+') {
			result = a + b;
		} else if (c == '-') {
			result = a - b;
		} else if (c == '*') {
			result = a * b;
		} else if (c == '/') {
			result = a / b;
		} else if (c == '%') {
			result = a % b;
		} else if (c == '^') {
			if (b == 1) {
				result = a;
			} else {
				result = a;
				for (int i = 2; i <= b; i++) {
					result = result * a;
				}
			}
		} else {
			System.out.println("Oops! Unknown operation: ");
		}

		System.out.println(a + " " + c + " " + b + " = " + result);
	}
}