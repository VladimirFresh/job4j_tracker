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
        return Math.abs(x - c);
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        Calculator multi = new Calculator();
        int resultMulti = multi.multiply(10);
        System.out.println(resultMulti);
        int resultMinus = Calculator.minus(10);
        System.out.println(resultMinus);
        Calculator div = new Calculator();
        int resultDiv = div.divide(10);
        System.out.println(resultDiv);
        Calculator sum = new Calculator();
        int resultSumAll = sum.sumAllOperation(10);
        System.out.println(resultSumAll);

    }
}
