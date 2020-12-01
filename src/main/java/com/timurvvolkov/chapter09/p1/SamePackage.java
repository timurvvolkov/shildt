package com.timurvvolkov.chapter09.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из того же самого пакета");
        System.out.println("n = " + p.n);
//        System.out.println("npri = " + p.npri);
        System.out.println("npro = " + p.npro);
        System.out.println("npub = " + p.npub);
    }
}
