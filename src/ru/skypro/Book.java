package ru.skypro;

import java.util.Objects;

public class Book {
    private final String bookName;
    public Author authorFullName;
    private int bookYear;

public Book(String bookName, Author authorFullName, int bookYear) {
    this.bookName = bookName;
    this.authorFullName = authorFullName;
    this.bookYear = bookYear;
}

public  String getBookName() {
    return bookName;
    }

    public Author getAuthorFullName() {
    return authorFullName;
    }

    public int getBookYear() {
    return bookYear;
    }

    public void setBookYear(int bookYear){
    this.bookYear = bookYear;
    }

    public String toString() {
    return authorFullName + " napisal roman " + "'"+this.bookName+"'" + " v " + bookYear + " godu";
    }

    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }
}
