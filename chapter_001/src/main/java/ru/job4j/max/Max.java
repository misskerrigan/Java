package ru.job4j.max;

public class Max {

    public int max(int first, int second, int third) {
        return Math.max(third, Math.max(first, second));
    }

}
