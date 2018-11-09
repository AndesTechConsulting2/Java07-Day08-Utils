package org.andestech.learning.rfb18.g2;

import java.io.Serializable;
import java.util.Random;

public class Book implements Comparable<Book>, Serializable {
    private int year;

    private int id;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(int year, String author, String title) {
        this.id = new Random().nextInt(1000_000);
        this.year = year;
        this.author = author;
        this.title = title;
    }

    private String author, title;

    @Override
    public String toString(){
        return  "id:" + id + ", Book: " + title + ", by " + author +
                ", year: " +year +".";
    }


    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }
}

