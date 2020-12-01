package com.timurvvolkov.chapter09.p2;

import com.timurvvolkov.chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");
//        System.out.println("n = " + p.n);
//        System.out.println("npri = " + p.npri);
//        System.out.println("npro = " + p.npro);
        System.out.println("npub = " + p.npub);
    }
}
