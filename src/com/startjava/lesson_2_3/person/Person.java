package com.startjava.lesson_2_3.person;

public class Person {

	String gender = "male";
	String name = "Sergey";
	int height = 184;
	int weight = 73;
	int age = 35;

	void move() {
		System.out.println("Вы идете.");
	}

	void sit() {
		System.out.println("Вы сидите.");
	}

	void run() {
		System.out.println("Вы бежите.");
	}

	boolean speak() {
		System.out.println("Вы говорите.");
		return true;
	}

	boolean learnJava() {
		System.out.println("Вы что-то выучили.");
		return true;
	}
}