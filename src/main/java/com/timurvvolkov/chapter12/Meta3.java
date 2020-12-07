package com.timurvvolkov.chapter12;

import java.lang.reflect.Method;

class Meta3 {
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
