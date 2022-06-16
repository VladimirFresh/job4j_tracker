package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        ball.tryRun(false);
        Wolf wolf = new Wolf();
        ball.tryRun(false);
        Fox fox = new Fox();
        ball.tryRun(true);
    }
}
