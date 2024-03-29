package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public int multiply(int b) {
        return x * b;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(Calculator.sum(10));
        System.out.println(calculator.multiply(10));
        System.out.println(Calculator.minus(10));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10));

    }
}
