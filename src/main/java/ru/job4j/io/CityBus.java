package ru.job4j.io;

import ru.job4j.poly.Vehicle;

public class CityBus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус ездит по дорогам");
    }

    @Override
    public void carriesPass() {
        System.out.println("Автобус может перевезти 50 человек");
    }
}
