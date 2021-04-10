package com.timurvvolkov.chapter30;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Конструкторы:");
            Constructor[] constructors = c.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(" " + constructors[i]);
            }

            System.out.println("Поля:");
            Field[] fields = c.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(" " + fields[i]);
            }

            System.out.println("Методы:");
            Method[] methods = c.getMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(" " + methods[i]);
            }
        } catch (Exception e) {
            System.out.println("Исключение: " + e);
        }
    }
}
