package com.timurvvolkov.dmdev.Lesson11_1;

/**
 * Написать тестовый класс с методом main программу,
 * демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

class RectangleDemo {
    public static void main(String[] args) {
        Point p1 = new Point(-2, -2);
        Point p2 = new Point(2, 1);
        System.out.println("Расстояние между точками: " + p1.distance(p2));
        Rectangle r = new Rectangle(p1, p2);
        System.out.println("Площадь прямоугольника: " + r.square());
        System.out.println("Длина диагонали прямоугольника: " + r.diagLength());
    }
}
