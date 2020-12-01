package com.timurvvolkov.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y равно: " + y);
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
