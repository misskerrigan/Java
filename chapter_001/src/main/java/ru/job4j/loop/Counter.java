package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int i = 0;
        for (start = 0; start <= finish; start++) {
            if (start % 2 == 0) {
                i = i + start;
            }
        }
        return i;
    }
}


