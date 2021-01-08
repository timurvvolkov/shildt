package com.timurvvolkov.chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

class GregorianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr",
                           "May", "Jun", "Jul", "Aug",
                           "Sep", "Oct", "Nov", "Dec"};
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.print("Дата: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));
        if (gcalendar.isLeapYear(year)) {
            System.out.println("Текущий год високосный");
        } else {
            System.out.println("Текущий год не високосный");
        }
    }
}
