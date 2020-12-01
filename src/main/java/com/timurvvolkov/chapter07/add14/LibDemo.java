package com.timurvvolkov.chapter07.add14;

public class LibDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Seagull", "Bach", 1970, 87);
        book1.setName("Parfumer");
        book1.setAuthor("Zuskind");
        book1.setYear(1985);
        book1.setPages(568);
        Lib lib = new Lib();
        lib.add(book1);
        lib.add(book1);
        lib.remove(1);
        lib.add(book2);
        lib.list();
    }
}
