package com.timurvvolkov.chapter19;

import java.util.Comparator;

class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}
