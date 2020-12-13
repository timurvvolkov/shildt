package com.timurvvolkov.chapter14;

class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getob() {
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }

    void showtype() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
