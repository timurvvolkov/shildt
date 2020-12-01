package com.timurvvolkov.chapter07;

public class Test3 {
    int a, b;

    public Test3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
