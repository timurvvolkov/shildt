package com.timurvvolkov.dmdev.Lesson10_3;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */
class Palindrom {
    static boolean isPalindrom(String s) {
        s = s.trim().replaceAll(" ", "").toLowerCase();
        char[] arr = s.toCharArray();
        char[] revArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        String r = new String(revArr);
        return s.equals(r);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("Жопа Апож"));
        System.out.println(isPalindrom("ЖоПа аПоз"));
    }
}
