package ru.timurvvolkov.chapter05;

public class FindPrime {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime;
        isPrime = num < 2 ? false : true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Простое число");
        } else {
            System.out.println("Не простое число");
        }
    }
}
