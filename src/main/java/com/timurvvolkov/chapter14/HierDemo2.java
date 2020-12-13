package com.timurvvolkov.chapter14;

class HierDemo2 {
    public static void main(String[] args) {
        Gen2a<String> w = new Gen2a<>("Добро пожаловть", 47);
        System.out.print(w.getob() + " " + w.getnum());
    }
}
