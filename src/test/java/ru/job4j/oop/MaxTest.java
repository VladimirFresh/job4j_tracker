package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax2To3Then3() {
        Max rsl = new Max();
        int expected = 3;
        Assert.assertEquals(expected, rsl.max(2, 3));
    }

    @Test
    public void whenMax2To3To4Then4() {
        Max rsl = new Max();
        int expected = 4;
        Assert.assertEquals(expected, rsl.max(2, 3, 4));
    }

    @Test
    public void WhenMax2To3To4To5Then5() {
        Max rsl = new Max();
        int expected = 5;
        Assert.assertEquals(expected, rsl.max(2, 3, 4, 5));
    }
}