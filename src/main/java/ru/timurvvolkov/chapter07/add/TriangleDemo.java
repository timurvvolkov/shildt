package ru.timurvvolkov.chapter07.add;

public class TriangleDemo {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle(0, 0, 5, 7, 3, 9);
        tr1.info();
        tr2.info();
    }
}
