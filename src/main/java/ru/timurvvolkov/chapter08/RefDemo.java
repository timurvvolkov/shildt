package ru.timurvvolkov.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        System.out.println("Объем weightbox равен " + weightbox.volume());
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();
        plainbox = weightbox;
        System.out.println("Объем plainbox равен " + plainbox.volume());
//        System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
