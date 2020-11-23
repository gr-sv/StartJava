public class Wolf {
	String gender = "male";
	String name = "Ferdinand";
	String color = "grey";
	int weight = 55;

	void go() {
		System.out.println("Волк прошел 10 м.");
	}

	void sit() {
		System.out.println("Волк сидел 5 мин.");
	}

	void run() {
		System.out.println("Волк пробежал 1 км.");
	}

	void hunt() {
		System.out.println("Волк охотился.");
	}

	boolean howl() {
		System.out.println("Волк выл на луну.");
		return true;
	}

}