package com.timurvvolkov.dmdev.Lesson11_1;

/**
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 */

class Rectangle {
    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public double square() {
        return Math.abs((leftUp.getX() - rightDown.getX()) * (leftUp.getY() - rightDown.getY()));
    }

    public double diagLength() {
        return leftUp.distance(rightDown);
    }
}
