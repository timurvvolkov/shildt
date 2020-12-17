package com.timurvvolkov.chapter17;

class GetCharsDemo {
    public static void main(String[] args) {
        String s = "Это демонстрация метода getChars().";
        int start = 4;
        int end = 8;
        char[] buf = new char[end - start];
        s.getChars(4, 8, buf, 0);
        System.out.println(buf);
    }
}
