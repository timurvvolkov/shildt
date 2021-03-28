package com.timurvvolkov.chapter30;

import java.util.regex.Pattern;

class RegExpr9 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ ,.!]");

        String[] strs = pat.split("one two, alpha9 12!done.");

        for (int i = 0; i < strs.length; i++) {
            System.out.println("Следующая лексема: " + strs[i]);
        }
    }
}
