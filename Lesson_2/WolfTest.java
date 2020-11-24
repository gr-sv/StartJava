public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.gender = "male";
		wolfOne.name = "Ferdinand";
		wolfOne.color = "Gray";
		wolfOne.weight = 55;
		wolfOne.age = 13;

		System.out.println("Wolf's gender = " + wolfOne.gender);
		System.out.println("Wolf's name = " + wolfOne.name);
		System.out.println("Wolf's color = " + wolfOne.color);
		System.out.println("Wolf's weight = " + wolfOne.weight);
		System.out.println("Wolf's age = " + wolfOne.age);


		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.hunt();
		System.out.println(wolfOne.howl());
	}
}