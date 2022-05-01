package ru.skypro;

import java.util.Objects;

public class Author {
    public String authorName;
    public String authorSurname;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorFullName() {
        return authorName + " " + authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String toString() {
        return "Avtora zvali " + authorName + " " + authorSurname;
    }


    public int hashCode() {
        return Objects.hash(authorSurname);
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author firstAuthor = (Author) other;
        return authorSurname.equals(firstAuthor.authorSurname) && authorName.equals(firstAuthor.authorName);
    }

}