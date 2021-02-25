package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;

    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int i, int number) {
        numbers[i] = number;
    }
}
