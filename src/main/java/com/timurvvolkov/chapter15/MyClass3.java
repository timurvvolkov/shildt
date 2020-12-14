package com.timurvvolkov.chapter15;

class MyClass3<T> {
    private T val;

    MyClass3(T val) {
        this.val = val;
    }

    MyClass3() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
