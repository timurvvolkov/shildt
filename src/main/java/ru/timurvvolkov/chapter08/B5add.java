package ru.timurvvolkov.chapter08;

public class B5add extends A5 {
    int k;

    B5add(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
