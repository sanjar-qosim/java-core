package lesson_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Book {

    private Map<Integer, Book> books = new HashMap<>();
    Random random = new Random();
    private int isbn;
    private String author = null;
    private String name = null;

    public Book(){}

    private Book(int isbn, String author, String name) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
    }

    public void addBook(String author, String name){
        int isbn = random.nextInt();
        books.put(isbn, new Book(isbn, author, name));
    }

    public void showAllBooks() {
        books.forEach((integer, book) -> System.out.println(book));
    }

    @Override
    public String toString() {
        return "Book{" +
            "isbn=" + isbn + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author +
            '}';
    }
}
