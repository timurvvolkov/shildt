package com.timurvvolkov.chapter07.add14;

public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;

    Book() {
    }

    Book(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1000 && year <= 2100) {
            this.year = year;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages >= 1 && pages <= 3000) {
            this.pages = pages;
        }
    }

    @Override
    public String toString() {
        return getName() + ", " + getAuthor() + ", year: " + getYear() +", pages: " + getPages();
    }
}
