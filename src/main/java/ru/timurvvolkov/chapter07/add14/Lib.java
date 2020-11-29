package ru.timurvvolkov.chapter07.add14;

public class Lib {
    private final int MAX_BOOKS = 10000;
    private Book[] lib = new Book[MAX_BOOKS];
    private int count = 0;

    public void add(Book book) {
        lib[count++] = book;
    }

    public void remove(int index) {
        lib[count--] = null;
    }

    public void list() {
        for (int i = 0; i <= count; i++) {
            System.out.println(lib[i]);
        }
    }
}
