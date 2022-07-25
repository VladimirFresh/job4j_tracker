package ru.job4j.io;

import ru.job4j.poly.Vehicle;

public class PubTransport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle cityBus = new CityBus();

        Vehicle[] vehicles = new Vehicle[] {plane, train, cityBus};
        for (Vehicle a : vehicles) {
            a.move();
            a.carriesPass();
        }
    }
}
