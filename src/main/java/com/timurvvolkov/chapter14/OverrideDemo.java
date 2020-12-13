package com.timurvvolkov.chapter14;

class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2b<Integer> iOb2 = new Gen2b<>(99);
        Gen2b<String> strOb2 = new Gen2b<>("Тест обобщений");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
