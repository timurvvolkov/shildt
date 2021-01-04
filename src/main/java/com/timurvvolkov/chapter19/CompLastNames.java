package com.timurvvolkov.chapter19;

import java.util.Comparator;

class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
