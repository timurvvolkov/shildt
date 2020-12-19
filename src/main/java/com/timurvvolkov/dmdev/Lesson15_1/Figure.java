package com.timurvvolkov.dmdev.Lesson15_1;

abstract class Figure {
    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();
}
