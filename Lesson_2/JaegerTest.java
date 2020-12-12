public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();

		System.out.println("Jaeger one");

		jaegerOne.setModelName("Tacit Ronin");
		jaegerOne.setMark("Mark-1");
		jaegerOne.setCountry("Japan");
		jaegerOne.setHeight(74.37f);
		jaegerOne.setWeight(7.45f);
		jaegerOne.setSpeed(8);
		jaegerOne.setStrength(7);
		jaegerOne.setArmor(3);

		System.out.println("Model name: " + jaegerOne.getModelName());
		System.out.println("Mark: " + jaegerOne.getMark());
		System.out.println("Country: " + jaegerOne.getCountry());
		System.out.println("Height: " + jaegerOne.getHeight() + " m");
		System.out.println("Weight: " + jaegerOne.getWeight() + " tons");
		System.out.println("Speed: " + jaegerOne.getSpeed());
		System.out.println("Strength: " + jaegerOne.getStrength());
		System.out.println("Armor: " + jaegerOne.getArmor());

		System.out.println(jaegerOne.drift());
		jaegerOne.move();
		jaegerOne.joinTheBattle();
		System.out.println(jaegerOne.powerMove());

		System.out.println("Jaeger two");

		jaegerTwo.setModelName("Gypsy Danger");
		jaegerTwo.setMark("Mark-3");
		jaegerTwo.setCountry("USA");
		jaegerTwo.setHeight(79.25f);
		jaegerTwo.setWeight(1.98f);
		jaegerTwo.setSpeed(7);
		jaegerTwo.setStrength(8);
		jaegerTwo.setArmor(6);

		System.out.println("Model name: " + jaegerTwo.getModelName());
		System.out.println("Mark: " + jaegerTwo.getMark());
		System.out.println("Country: " + jaegerTwo.getCountry());
		System.out.println("Height: " + jaegerTwo.getHeight() + " m");
		System.out.println("Weight: " + jaegerTwo.getWeight() + " tons");
		System.out.println("Speed: " + jaegerTwo.getSpeed());
		System.out.println("Strength: " + jaegerTwo.getStrength());
		System.out.println("Armor: " + jaegerTwo.getArmor());

		System.out.println(jaegerTwo.drift());
		jaegerTwo.move();
		jaegerTwo.joinTheBattle();
		System.out.println(jaegerTwo.powerMove());


	}
}