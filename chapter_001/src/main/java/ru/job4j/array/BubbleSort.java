package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        boolean check = false;
        while (!check) {
            check = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    check = false;
                    int b = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = b;
                }
            }
        }
        return  array;
    }
}

