package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic first = new DummyDic();
        String say = first.engToRus("Potato");
        System.out.println(say);

    }
}
