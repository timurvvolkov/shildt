package ru.timurvvolkov.chapter07.add13;

public class Rect {
    double x1, x2, y1, y2;

    {
        x1 = 0;
        y1 = 0;
        x2 = 10;
        y2 = 5;
    }

    Rect() {
    }

    Rect(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Rect(double x1, double y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    void info() {
        System.out.println("x1 = " + x1 + "; y1 = " + y1 + "; x2 = " + x2 + "; y2 = " + y2);
    }
}
