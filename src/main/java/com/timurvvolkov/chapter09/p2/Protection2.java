package com.timurvvolkov.chapter09.p2;

import com.timurvvolkov.chapter09.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
//        System.out.println("n = " + n);
//        System.out.println("npri = " + npri);
        System.out.println("npro = " + npro);
        System.out.println("npub = " + npub);
    }
}
