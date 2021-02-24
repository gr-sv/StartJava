package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;

    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
