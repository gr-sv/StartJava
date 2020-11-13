public class Calculator {
	public static void main(String[] args) {
		int a = 15;
		int b = 2;
		int result = 0;
		char sign = '^';

		if (sign == '+') {
			result = a + b;
		} else if (sign == '-') {
			result = a - b;
		} else if (sign == '*') {
			result = a * b;
		} else if (sign == '/') {
			result = a / b;
		} else if (sign == '%') {
			result = a % b;
		} else if (sign == '^') {
			if (b == 0) {
				result = 1;
			} else if (b == 1) {
				result = a;
			} else {
				result = a;
				for (int i = 2; i <= b; i++) {
					result *= a;
				}
			}
		} else {
			System.out.println("Oops! Unknown operation: ");
		}

		System.out.println(a + " " + sign + " " + b + " = " + result);
	}
}