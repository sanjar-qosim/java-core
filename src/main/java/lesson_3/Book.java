package lesson_3;

import java.util.ArrayList;

public class Book {

    private final String name;
    private final String author;
    private final int year;
    private int status = 0;  // 0 - not reserved; 1 - reserved

    private final ArrayList<Book> books = new ArrayList<>();

    private Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void addNewBook(String name, String author, int year) {
        books.add(new Book(name, author, year));
    }

    public Book getBookInfo(String name) {
        for (Book tmp : books) {
            if (tmp.name.equals(name)) {
                return tmp;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean reserveBook(String name) {
        for (Book tmp : books) {
            if (tmp.name.equals(name) && tmp.status == 0) {
                tmp.status = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", year=" + year +
            ", status=" + status +
            ", books=" + books +
            '}';
    }
}