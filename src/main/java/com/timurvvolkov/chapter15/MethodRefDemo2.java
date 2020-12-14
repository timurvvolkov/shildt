package com.timurvvolkov.chapter15;

class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
