package com.timurvvolkov.dmdev.Lesson10_3;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
class RomeNumbers {
    static int toArabicNumbers(String s) {
        int sum = 0;
        while (!s.isEmpty()) {
            if (s.contains("CM")) {
                sum += 900;
                s = s.replaceFirst("CM", "");
            }
            if (s.contains("M")) {
                sum += 1000;
                s = s.replaceFirst("M", "");
            }
            if (s.contains("CD")) {
                sum += 400;
                s = s.replaceFirst("CD", "");
            }
            if (s.contains("D")) {
                sum += 500;
                s = s.replaceFirst("D", "");
            }
            if (s.contains("XC")) {
                sum += 90;
                s = s.replaceFirst("XC", "");
            }
            if (s.contains("C")) {
                sum += 100;
                s = s.replaceFirst("C", "");
            }
            if (s.contains("XL")) {
                sum += 40;
                s = s.replaceFirst("XL", "");
            }
            if (s.contains("L")) {
                sum += 50;
                s = s.replaceFirst("L", "");
            }
            if (s.contains("IX")) {
                sum += 9;
                s = s.replaceFirst("IX", "");
            }
            if (s.contains("X")) {
                sum += 10;
                s = s.replaceFirst("X", "");
            }
            if (s.contains("IV")) {
                sum += 4;
                s = s.replaceFirst("IV", "");
            }
            if (s.contains("V")) {
                sum += 5;
                s = s.replaceFirst("V", "");
            }
            if (s.contains("I")) {
                sum += 1;
                s = s.replaceFirst("I", "");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(toArabicNumbers("MXXIV"));
        System.out.println(toArabicNumbers("CMXLVIII"));
    }
}
