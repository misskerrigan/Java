package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int orginal = array.length;
        for (int out = 0; out < orginal; out++) {
            for (int in = out + 1; in < orginal; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[orginal - 1];
                    orginal--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, orginal);
    }
}

