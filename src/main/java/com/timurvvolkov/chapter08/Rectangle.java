package com.timurvvolkov.chapter08;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области прямоугольника.");
        return dim1 * dim2;
    }
}
