package com.timurvvolkov.chapter14;

class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getob() {
        return ob;
    }

    void showtype() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
