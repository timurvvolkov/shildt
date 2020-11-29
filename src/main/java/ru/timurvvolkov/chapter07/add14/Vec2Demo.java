package ru.timurvvolkov.chapter07.add14;

public class Vec2Demo {
    public static void main(String[] args) {
        Vec2 v1 = new Vec2();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Vec2 v2 = new Vec2(p1, p2);
        v1.setAX(3);
        v1.setAY(2);
        v1.setBX(1);
        v1.setBY(2);
        Vec2 v3 = Vec2.sum(v1, v2);
        Vec2 v4 = Vec2.sub(v1, v2);
        System.out.println("Вектор 1: " + v1);
        System.out.println("Вектор 2: " + v2);
        System.out.println("Вектор 3: " + v3);
        System.out.println("Вектор 4: " + v4);
    }
}
