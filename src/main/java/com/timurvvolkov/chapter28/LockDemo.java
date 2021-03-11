package com.timurvvolkov.chapter28;

import java.util.concurrent.locks.ReentrantLock;

class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
    }
}

class Shared2 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счетчик");
            Shared2.count++;
            System.out.println("Поток " + name + ": " + Shared2.count);
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
