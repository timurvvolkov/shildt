package ru.timurvvolkov.chapter07.add13;

public class RectDemo {
    public static void main(String[] args) {
        Rect r1 = new Rect(5.0, 2.0, 8.0, 9.0);
        Rect r2 = new Rect();
        Rect r3 = new Rect(7.0, 1.0, 5, 8);
        r1.info();
        r2.info();
        r3.info();
    }
}
