package ru.timurvvolkov.chapter07;

public class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test o) {
        return o.a == a && o.b == b;
    }
}
