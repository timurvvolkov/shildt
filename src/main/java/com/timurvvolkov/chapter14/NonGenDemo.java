package com.timurvvolkov.chapter14;

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showtype();
        System.out.println("Значение: " + (Integer) iOb.getob());
        System.out.println();
        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showtype();
        System.out.println("Значение: " + (String) strOb.getob());
//        iOb = strOb;
//        int v = (Integer) iOb.getob();
    }
}
