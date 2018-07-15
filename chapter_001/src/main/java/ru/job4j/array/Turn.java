package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 1; i <= array.length / 2; i++) {
            int temp = array[i - 1];
            array[i - 1] = array[array.length - i];
            array[array.length - i] = temp;
        }
        return array;
    }
}