package com.timurvvolkov.chapter13;

class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        a = i;
        b = i;
    }

    MyClass() {
        a = 0;
        b = 0;
    }
}
