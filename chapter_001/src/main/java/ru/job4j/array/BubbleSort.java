package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
            for (int j = array.length; j > 0; j--) {
                for (int i = 1; i < j; i++) {
                    if (array[i - 1] > array[i]) {
                        int b = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = b;
                    }
                }
            }
        return  array;
    }
}

