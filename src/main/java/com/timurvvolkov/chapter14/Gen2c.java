package com.timurvvolkov.chapter14;

class Gen2c extends Gen<String> {
    Gen2c(String o) {
        super(o);
    }

    @Override
    String getob() {
        System.out.print("Вызван метод String getob(): ");
        return ob;
    }
}
