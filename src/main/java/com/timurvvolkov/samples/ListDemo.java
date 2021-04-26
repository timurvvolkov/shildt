package com.timurvvolkov.samples;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        list.add(new Object());
        list.add("One");
        list.remove("One");
        System.out.println(list);
    }
}
