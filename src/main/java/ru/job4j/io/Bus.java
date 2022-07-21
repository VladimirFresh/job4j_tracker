package ru.job4j.io;

import ru.job4j.poly.Transport;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус - вид транспорта");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("В автобусе едут " + pass + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        int cost = 50;
        return fuel * cost;
    }
}
