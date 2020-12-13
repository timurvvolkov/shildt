package com.timurvvolkov.chapter14;

class Gen2b<T> extends Gen<T> {
    Gen2b(T o) {
        super(o);
    }

    @Override
    T getob() {
        System.out.print("Метод getob() из класса Gen2b: ");
        return ob;
    }
}
