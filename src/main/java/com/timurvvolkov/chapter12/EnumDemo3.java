package com.timurvvolkov.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;
        System.out.println("Яблоко сорта Winesap стоит " + Apple3.Winesap.getPrice());
        System.out.println("Цены на все сорта яблок:");
        for (Apple3 a : Apple3.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}
