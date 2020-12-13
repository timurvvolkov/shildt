package com.timurvvolkov.chapter14;

class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Тест обобщений");
        Gen raw = new Gen(new Double(98.6));
        System.out.println("Значение: " + raw.getob());
//        int i = (Integer) raw.getob();
        strOb = raw;
//        String str = strOb.getob();
        raw = iOb;
//        double d = (Double) raw.getob();
    }
}
