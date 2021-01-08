package com.timurvvolkov.chapter20;

import java.util.Date;

class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long msec = date.getTime();
        System.out.println("Количество миллисекунд, прошедших с 1 января 1970 г. по Гринвичу = " + msec);
    }
}
