package ru.timurvvolkov.chapter07;

public class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("Вывод: outer_x = " + outerX);
        }
    }

    void showY() {
//        System.out.println(y);
    }
}
