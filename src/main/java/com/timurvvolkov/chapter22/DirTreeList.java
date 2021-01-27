package com.timurvvolkov.chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class DirTreeList {
    public static void main(String[] args) {
        String dirname = "MyDir";
        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
