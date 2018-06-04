package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void maxFromFirstSecondAndThird() {
        Max maxim = new Max();
        int result = maxim.max(4, 5, 6);
        assertThat(result, is(6));
    }
}
