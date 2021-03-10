package com.timurvvolkov.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd12 = new CountDownLatch(5);
        CountDownLatch cd13 = new CountDownLatch(5);
        CountDownLatch cd14 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        es.execute(new MyThread5(cd1, "A"));
        es.execute(new MyThread5(cd12, "B"));
        es.execute(new MyThread5(cd13, "C"));
        es.execute(new MyThread5(cd14, "D"));

        try {
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}

class MyThread5 implements Runnable {
    String name;
    CountDownLatch latch;

    MyThread5(CountDownLatch c, String n) {
        latch = c;
        name = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
