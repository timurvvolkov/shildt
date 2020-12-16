package com.timurvvolkov.chapter17;

class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Объект b типа Box: " + b;
        System.out.println(b);
        System.out.println(s);
    }
}
