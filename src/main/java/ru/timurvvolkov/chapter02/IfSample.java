package ru.timurvvolkov.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if (x < y) {
            System.out.println("x меньше y");
        }
        x *= 2;
        if (x == y) {
            System.out.println("x равно y");
        }
        x *= 2;
        if (x > y) {
            System.out.println("x больше y");
        }
        if (x == y) {
            System.out.println("выводиться не будет");
        }
    }
}
