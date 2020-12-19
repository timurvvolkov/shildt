package com.timurvvolkov.dmdev.Lesson15_1;

final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}

