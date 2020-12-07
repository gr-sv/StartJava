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
		if(b == 0) {
			result = 1;
		} else if(b == 1) {
			result = a;
		} else {
			result = a;
			for (int i = 2; i <= b; i++) {
				result *= a;
			}
		}
		return result;
	}

	public int mathResult() {
		switch(sign) {
			case '+':
				mathSum();
				break;

			case '-':
				mathSub();
				break;

			case '*':
				mathMult();
				break;

			case '/':
				mathDiv();
				break;

			case '%':
				mathRemOfDiv();
				break;

			case '^':
				mathExp();
				break;

			default:
				System.out.println("Oops! Unknown operation!");
				result = 0;
		}
		return result;
	}
}

