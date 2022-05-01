package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Jordj", "Oruell");
        System.out.println("Avtor knigi - " + firstAuthor.getAuthorName() + " " + firstAuthor.getAuthorSurname());
        Book firstBook = new Book("Skotnyi dvor", firstAuthor, 1945);
        System.out.println("Vpervye izdana - " + firstBook.getBookYear());
        firstBook.setBookYear(2019);
        System.out.println("Poslednyi god pereizdaniya - " + firstBook.getBookYear());
        System.out.println();

        Author secondAuthor = new Author("Lev", "Tolstoi");
        System.out.println("Avtor knigi - " + secondAuthor.getAuthorName() + " " + secondAuthor.getAuthorSurname());
        Book secondBook = new Book("Voina i mir", secondAuthor, 1867);
        System.out.println("Vpervye izdana - " + secondBook.getBookYear());
        secondBook.setBookYear(2009);
        System.out.println("Poslednyi god pereizdaniya - " + secondBook.getBookYear());
        System.out.println();
        System.out.println("Domashnyaya rabota 10");
        System.out.println();
        System.out.println(secondAuthor);
        System.out.println(secondBook);
        System.out.println();
        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstAuthor.equals(secondAuthor));


    }

}
