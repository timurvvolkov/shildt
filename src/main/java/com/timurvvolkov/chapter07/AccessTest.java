package com.timurvvolkov.chapter07;

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();
        ob.a = 10;
        ob.b = 20;
//        ob.c = 100;
        ob.setc(100);
        System.out.println("a, b и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
