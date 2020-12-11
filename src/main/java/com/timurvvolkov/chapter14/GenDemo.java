package com.timurvvolkov.chapter14;

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showtype();
        System.out.println("Значение: " + iOb.getob());
        System.out.println();
        Gen<String> strOb = new Gen<>("Тест обобщений");
        strOb.showtype();
        System.out.println("Значение: " + strOb.getob());
    }
}
