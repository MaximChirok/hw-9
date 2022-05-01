package ru.skypro;

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
}
