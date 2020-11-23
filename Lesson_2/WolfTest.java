public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("Wolf's gender = " + wolfOne.gender);
		System.out.println("Wolf's name = " + wolfOne.name);
		System.out.println("Wolf's color = " + wolfOne.color);
		System.out.println("Wolf's weight = " + wolfOne.weight);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.hunt();
		System.out.println(wolfOne.howl());
	}
}