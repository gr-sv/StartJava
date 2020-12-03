import java.util.Scanner;

public class CalculatorModTest {
	public static void main(String[] args) {
		CalculatorMod calcMod = new CalculatorMod ();
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое число");
		calcMod.a = sc.nextInt();

		System.out.println("Введите знак математической операции");
		calcMod.sign = sc.next().charAt(0);

		System.out.println("Введите второе число");
		calcMod.b = sc.nextInt();

		switch(calcMod.sign) {
			case '+':
				calcMod.mathSum();
				break;

			case '-':
				calcMod.mathSub();
				break;

			case '*':
				calcMod.mathMult();
				break;

			case '/':
				calcMod.mathDiv();
				break;

			case '%':
				calcMod.mathRemOfDiv();
				break;

			case '^':
				calcMod.mathExp();
				break;

			default:
				System.out.println("Oops! Unknown operation!");
		}

		System.out.println("Результат: " + calcMod.a + " " + calcMod.sign + " " + calcMod.b + " = " + calcMod.result);


		Scanner sc1 = new Scanner(System.in);
		System.out.println("Хотите продолжить вычисления? [да/нет]:");
		
		String yesOrNo = sc1.nextLine();
		
		switch(yesOrNo) {
			case "да":
				System.out.println("Введите первое число");
				break;
			case "нет":
				System.out.println("The End.");
				break;
			default:
				System.out.println("Хотите продолжить вычисления? [да/нет]:");
		}
	}
}


