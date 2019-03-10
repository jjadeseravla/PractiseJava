package com.twu.biblioteca;

public class BookManager {

    private Book[] books;

    public BookManager(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}
