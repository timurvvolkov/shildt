package ru.timurvvolkov.chapter08;

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
