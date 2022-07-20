package ru.job4j.io;

import ru.job4j.poly.Transport;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public int passengers(int pass) {
        return pass;
    }

    @Override
    public int refuel(int fuel, int cost) {
        return fuel * cost;
    }
}
