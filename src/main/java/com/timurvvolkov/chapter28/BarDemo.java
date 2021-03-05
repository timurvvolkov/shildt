package com.timurvvolkov.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");
        new Thread(new MyThread2(cb, "A")).start();
        new Thread(new MyThread2(cb, "B")).start();
        new Thread(new MyThread2(cb, "C")).start();
    }
}

class MyThread2 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread2(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
    }

    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}

class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
