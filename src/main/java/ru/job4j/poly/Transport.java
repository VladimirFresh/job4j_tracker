package ru.job4j.poly;

public interface Transport {
    void drive();

    int passengers(int pass);

    int refuel(int fuel, int cost);
}
