package ru.job4j.max;

public class Max {

    public int max(int first, int second) {
        return first < second ? second : first;
    }

    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
