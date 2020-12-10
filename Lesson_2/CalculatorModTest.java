import java.util.Scanner;

public class CalculatorModTest {
	public static void main(String[] args) {
		CalculatorMod calcMod = new CalculatorMod();
		Scanner sc = new Scanner(System.in);
		String userAnswer;

		do {
			System.out.println("Введите первое число");
			calcMod.setA(sc.nextInt());

			System.out.println("Введите знак математической операции");
			calcMod.setSign(sc.next().charAt(0));

			System.out.println("Введите второе число");
			calcMod.setB(sc.nextInt());

			calcMod.calculate();
			System.out.println("Результат: " + calcMod.getA() + " " + calcMod.getSign() + " " + calcMod.getB() + " = " + calcMod.calculate());
			sc.nextLine();

			do {
				System.out.println("Хотите продолжить вычисления? [да/нет]");
				userAnswer = sc.nextLine();
			} while (!userAnswer.equals("да") && !userAnswer.equals("нет"));
		} while (userAnswer.equals("да"));

		System.out.println("The end.");
	}
}


