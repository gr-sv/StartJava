import java.util.Scanner;

public class CalculatorModTest {
	public static void main(String[] args) {
		CalculatorMod calcMod = new CalculatorMod ();
		Scanner sc = new Scanner(System.in);
		String yesOrNo;


		do {
			System.out.println("Введите первое число");
			calcMod.setA(sc.nextInt());

			System.out.println("Введите знак математической операции");
			calcMod.setSign(sc.next().charAt(0));

			System.out.println("Введите второе число");
			calcMod.setB(sc.nextInt());

			calcMod.mathResult();

			System.out.println("Результат: " + calcMod.getA() + " " + calcMod.getSign() + " " + calcMod.getB() + " = " + calcMod.getResult());

			sc.nextLine();

			do {
				System.out.println("Хотите продолжить вычисления? [да/нет]");
				yesOrNo = sc.nextLine();
			} while (!yesOrNo.equals("да") && !yesOrNo.equals("нет"));

			if (yesOrNo.equals("нет")) {
				System.out.println("The end.");
			}
		} while (yesOrNo.equals("да"));
	}
}


