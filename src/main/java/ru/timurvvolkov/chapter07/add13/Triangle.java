package ru.timurvvolkov.chapter07.add13;

public class Triangle {
    Point p1, p2, p3;

    {
        p1 = new Point(0, 0);
        p2 = new Point(3, 0);
        p3 = new Point(0, 3);
    }

    Triangle() {
    }

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
    }

    void info() {
        System.out.println("x1 = " + p1.x + "; y1 = " + p1.y
                       + "; x2 = " + p2.x + "; y2 = " + p2.y
                       + "; x3 = " + p3.x + "; y3 = " + p3.y
        );
    }
}
