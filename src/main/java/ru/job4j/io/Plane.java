package ru.job4j.io;

import ru.job4j.poly.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }

    @Override
    public void carriesPass() {
        System.out.println("Самолет может перевезти 300 человек");
    }
}
