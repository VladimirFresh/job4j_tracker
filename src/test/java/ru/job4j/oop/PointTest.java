package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double dist = first.distance(second);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.001);
    }

    @Test
    public void when30to70Then4() {
        Point first = new Point(3, 0);
        Point second = new Point(7, 0);
        double dist = first.distance(second);
        double expected = 4;
        Assert.assertEquals(expected, dist, 0.001);
    }

    @Test
    public void when307To548Then4dot58() {
        Point first = new Point(3, 0, 7);
        Point second = new Point(5, 4, 8);
        double dist = first.distance3d(second);
        double expected = 4.58;
        Assert.assertEquals(expected, dist, 0.01);
    }
}