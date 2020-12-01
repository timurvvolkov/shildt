package com.timurvvolkov.chapter09;

abstract public class Incomplete implements CallBack {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
