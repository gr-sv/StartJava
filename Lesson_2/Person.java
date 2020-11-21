public class Person {

	String gender = "male";
	String name = "Sergey";

	int height = 184;
	int weight = 73;
	int age = 35;

	void move() {
		System.out.println("Вы прошли 5 шагов.");
	}

	void sit() {
		System.out.println("Вы сидели 10 мин.");
	}

	void run() {
		System.out.println("Вы пробежали 100 метров.");
	}

	boolean speak() {
		System.out.println("Вы говорили.");
		return true;
	}

	boolean learn() {
		System.out.println("Вы можете что-то выучили.");
		return true;
	}
}