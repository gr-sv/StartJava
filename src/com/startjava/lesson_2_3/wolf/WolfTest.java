package com.startjava.lesson_2_3.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setGender("male");
		wolfOne.setName("Ferdinand");
		wolfOne.setColor("Gray");
		wolfOne.setWeight(55);
		wolfOne.setAge(7);

		System.out.println("Wolf's gender = " + wolfOne.getGender());
		System.out.println("Wolf's name = " + wolfOne.getName());
		System.out.println("Wolf's color = " + wolfOne.getColor());
		System.out.println("Wolf's weight = " + wolfOne.getWeight());
		System.out.println("Wolf's age = " + wolfOne.getAge());


		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.hunt();
		System.out.println(wolfOne.howl());
	}
}