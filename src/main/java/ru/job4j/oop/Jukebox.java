package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String songOne = "Пусть бегут неуклюже";
        String songTwo = "Спокойной ночи";
        String unknown = "Песня не найдена";
        if (position == 1) {
            System.out.println(songOne);
        } else if (position == 2) {
            System.out.println(songTwo);
        } else {
            System.out.println(unknown);
        }
    }

    public static void main(String[] args) {
        Jukebox singer = new Jukebox();
        singer.music(1);
        singer.music(2);
        singer.music(4);
    }
}
