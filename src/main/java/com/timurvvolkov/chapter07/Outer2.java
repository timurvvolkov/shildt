package com.timurvvolkov.chapter07;

public class Outer2 {
    int outerX = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display() {
                    System.out.println("Вывод: outer_x = " + outerX);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}
