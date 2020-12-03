public class CalculatorMod {
	int a;
	int b;
	int result;
	char sign;

	public int mathSum() {
		result = a + b;
		return result;
	}

	public int mathSub() {
		result = a - b;
		return result;
	}

	public int mathMult() {
		result = a * b;
		return result;
	}

	public int mathDiv() {
		result = a / b;
		return result;
	}

	public int mathRemOfDiv() {
		result = a % b;
		return result;
	}

	public int mathExp() {
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
		return result;
	}
}

