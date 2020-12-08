public class CalculatorMod {
	private int a;
	private int b;
	private int result;
	private char sign;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate() {
		switch(sign) {
			case '+':
				result = a + b;
				break;

			case '-':
				result = a - b;
				break;

			case '*':
				result = a * b;
				break;

			case '/':
				result = a / b;
				break;

			case '%':
				result = a % b;
				break;

			case '^':
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
				break;

			default:
				System.out.println("Oops! Unknown operation!");
				result = 0;
		}
		return result;
	}
}

