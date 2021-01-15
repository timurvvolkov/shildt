package com.timurvvolkov.chapter20;

import java.util.Locale;
import java.util.ResourceBundle;

class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));

        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);
        System.out.println("\nНемецкая версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText"));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));
    }
}
