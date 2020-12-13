package com.timurvvolkov.chapter14;

class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<>("Значение равно: ", 99);
        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}
