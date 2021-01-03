package com.timurvvolkov.chapter19;

import java.util.Comparator;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
}
