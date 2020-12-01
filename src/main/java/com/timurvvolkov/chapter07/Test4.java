package com.timurvvolkov.chapter07;

public class Test4 {
    int a;

    Test4(int a) {
        this.a = a;
    }

    Test4 incrByTen() {
        return new Test4(a + 10);
    }
}
