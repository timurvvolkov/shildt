package ru.timurvvolkov.chapter08;

public class B5 extends A5 {
    int k;

    B5(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
