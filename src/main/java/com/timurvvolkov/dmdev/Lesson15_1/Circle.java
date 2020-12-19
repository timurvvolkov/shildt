package com.timurvvolkov.dmdev.Lesson15_1;

import static java.lang.Math.PI;

class Circle extends Figure implements WithPerimeter {
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }
}
