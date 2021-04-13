package com.timurvvolkov.chapter30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeDemo4 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.parse("June 21, 2017 12:01 AM",
                                                        DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
