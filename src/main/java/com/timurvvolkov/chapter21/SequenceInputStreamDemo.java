package com.timurvvolkov.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-выводв: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }
    }
}
