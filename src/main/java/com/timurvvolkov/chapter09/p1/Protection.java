package com.timurvvolkov.chapter09.p1;

public class Protection {
    int n = 1;
    private int npri = 2;
    protected int npro = 3;
    public int npub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("npri = " + npri);
        System.out.println("npro = " + npro);
        System.out.println("npub = " + npub);
    }
}
