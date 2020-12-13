package com.timurvvolkov.chapter14;

class Gen2a<T> extends NonGen2 {
    T ob;

    Gen2a(T ob, int i) {
        super(i);
        this.ob = ob;
    }

    T getob() {
        return ob;
    }
}
