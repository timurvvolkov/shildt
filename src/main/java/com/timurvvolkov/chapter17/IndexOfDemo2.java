package com.timurvvolkov.chapter17;

class IndexOfDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("one two one");
        int i;
        i = sb.indexOf("one");
        System.out.println("Индекс первого вхождения: " + i);
        i = sb.lastIndexOf("one");
        System.out.println("Индекс последнего вхождения: " + i);
    }
}
