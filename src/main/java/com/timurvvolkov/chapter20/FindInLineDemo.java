package com.timurvvolkov.chapter20;

import java.util.Scanner;

class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";
        Scanner conin = new Scanner(instr);
        conin.findInLine("Возраст: ");
        if (conin.hasNext()) {
            System.out.println(conin.next());
        } else {
            System.out.println("Ошибка!");
        }
        conin.close();
    }
}
