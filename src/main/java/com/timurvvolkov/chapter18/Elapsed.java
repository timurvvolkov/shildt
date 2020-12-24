package com.timurvvolkov.chapter18;

class Elapsed {
    public static void main(String[] args) {
        long start, end, startN, endN;
        System.out.println("Измерение времени перебора от 0 до 100000000");
        start = System.currentTimeMillis();
        startN = System.nanoTime();
        for (long i = 0; i < 100000000L; i++);
        end = System.currentTimeMillis();
        endN = System.nanoTime();
        System.out.println("Время выполнения: " + (end - start));
        System.out.println("Время выполнения nanoTime: " + (endN - startN));
    }
}
