package com.startjava.lesson_2_3.jaeger;

public class JaegerTest {
	public static void main(String[] args) {
		System.out.println("Jaeger one");
		Jaeger jaegerOne = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.45f, 8, 7, 3);

		System.out.println("Model name: " + jaegerOne.getModelName());
		System.out.println("Mark: " + jaegerOne.getMark());
		System.out.println("Country: " + jaegerOne.getCountry());
		System.out.println("Height: " + jaegerOne.getHeight() + " m");
		System.out.println("Weight: " + jaegerOne.getWeight() + " thousand tons");
		System.out.println("Speed: " + jaegerOne.getSpeed());
		System.out.println("Strength: " + jaegerOne.getStrength());
		System.out.println("Armor: " + jaegerOne.getArmor());

		System.out.println(jaegerOne.drift());
		jaegerOne.move();
		jaegerOne.joinTheBattle();
		System.out.println(jaegerOne.powerMove());

		System.out.println("Jaeger two");
		Jaeger jaegerTwo = new Jaeger("Gypsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);

		System.out.println("Model name: " + jaegerTwo.getModelName());
		System.out.println("Mark: " + jaegerTwo.getMark());
		System.out.println("Country: " + jaegerTwo.getCountry());
		System.out.println("Height: " + jaegerTwo.getHeight() + " m");
		System.out.println("Weight: " + jaegerTwo.getWeight() + " thousand tons");
		System.out.println("Speed: " + jaegerTwo.getSpeed());
		System.out.println("Strength: " + jaegerTwo.getStrength());
		System.out.println("Armor: " + jaegerTwo.getArmor());

		System.out.println(jaegerTwo.drift());
		jaegerTwo.move();
		jaegerTwo.joinTheBattle();
		System.out.println(jaegerTwo.powerMove());
	}
}