package ru.timurvvolkov.chapter07.add;

public class LineDemo {
    public static void main(String[] args) {
        Line line1 = new Line();
        line1.x1 = 3;
        line1.y1 = 5;
        line1.x2 = 6;
        line1.y2 = 4;
        System.out.println("Линия 1: x1 = " + line1.x1 + "; y1 = " + line1.y1 + "; x2 = " + line1.x2 + "; y2 = " + line1.y2);
        Line line2 = new Line();
        line2.x1 = 5;
        line2.y1 = 1;
        line2.x2 = 0;
        line2.y2 = 3;
        System.out.println("Линия 2: x1 = " + line2.x1 + "; y1 = " + line2.y1 + "; x2 = " + line2.x2 + "; y2 = " + line2.y2);
    }
}
