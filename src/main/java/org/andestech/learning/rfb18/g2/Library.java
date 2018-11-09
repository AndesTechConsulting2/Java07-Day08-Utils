package org.andestech.learning.rfb18.g2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Library {

    public Library(){}

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    @XmlElement(name = "Book")
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    private ArrayList<Book> books;

    public void addBook(Book book){
        books.add(book);
    }



}
