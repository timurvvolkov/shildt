package com.timurvvolkov.chapter14;

class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen4<Integer> iOb = new Gen4<>(50, n);
//        Gen4<Integer> gens[] = new Gen<>[10];
        Gen4<?>[] gens = new Gen4<?>[10];
    }
}
