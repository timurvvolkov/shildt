package ru.timurvvolkov.chapter05;

public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for ( ; !done;) {
            System.out.println("i равно " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
