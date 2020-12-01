package com.timurvvolkov.chapter09.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
//        System.out.println("npri = " + npri);
        System.out.println("npro = " + npro);
        System.out.println("npub = " + npub);
    }
}
