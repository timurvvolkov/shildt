package com.timurvvolkov.chapter14;

class NonGen {
    Object ob;

    NonGen(Object ob) {
        this.ob = ob;
    }

    Object getob() {
        return ob;
    }

    void showtype() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}
