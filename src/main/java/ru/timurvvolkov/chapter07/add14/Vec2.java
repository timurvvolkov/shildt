package ru.timurvvolkov.chapter07.add14;

public class Vec2 {
    private Point a;
    private Point b;
    private static final int MAX_VAL = 100;

    Vec2() {
        this.a = new Point(0, 0);
        this.b = new Point(0, 0);
    }

    Vec2(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public int getAX() {
        return a.x;
    }

    public int getAY() {
        return a.y;
    }

    public int getBX() {
        return b.x;
    }

    public int getBY() {
        return b.y;
    }

    public void setAX(int value) {
        if (value >= -MAX_VAL && value <= MAX_VAL) {
            a.x = value;
        }
    }

    public void setAY(int value) {
        if (value >= -MAX_VAL && value <= MAX_VAL) {
            a.y = value;
        }
    }

    public void setBX(int value) {
        if (value >= -MAX_VAL && value <= MAX_VAL) {
            b.x = value;
        }
    }

    public void setBY(int value) {
        if (value >= -MAX_VAL && value <= MAX_VAL) {
            b.y = value;
        }
    }

    public static Vec2 sum(Vec2 v1, Vec2 v2) {
        Point a = new Point(v1.a.x + v2.a.x, v1.a.y + v2.a.y);
        Point b = new Point(v1.b.x + v2.b.x, v1.b.y + v2.b.y);
        return new Vec2(a, b);
    }

    public static Vec2 sub(Vec2 v1, Vec2 v2) {
        Point a = new Point(v1.a.x - v2.a.x, v1.a.y - v2.a.y);
        Point b = new Point(v1.b.x - v2.b.x, v1.b.y - v2.b.y);
        return new Vec2(a, b);
    }

    public String toString() {
        return "a(" + getAX() + ", " + getAY() + "); b(" + getBX() + ", " + getBY() + ")";
    }
}
