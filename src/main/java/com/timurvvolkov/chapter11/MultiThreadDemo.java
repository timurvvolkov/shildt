package com.timurvvolkov.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
