package ru.job4j.max;

public class Max {

    public int max(int first, int second) {
        int result = first < second ? second : first;
        return result;
    }

}