package com.timurvvolkov.chapter14;

class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        System.out.println("Среднее значение iOb равно " + iOb.average());
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        System.out.println("Среднее значение dOb равно " + dOb.average());
    }
}
