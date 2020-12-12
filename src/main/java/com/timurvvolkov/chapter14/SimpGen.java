package com.timurvvolkov.chapter14;

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
        tgObj.showTypes();
        System.out.println("Значение ob1: " + tgObj.getob1());
        System.out.println("Значение ob2: " + tgObj.getob2());
    }
}
