package ru.job4j.io;

import ru.job4j.poly.Vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд ездит по рельсам");
    }

    @Override
    public void carriesPass() {
        System.out.println("Поезд может перевезти 700 человек");
    }
}
