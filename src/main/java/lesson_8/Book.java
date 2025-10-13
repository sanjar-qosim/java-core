package lesson_8;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private static int counter = 1;
    private final int isbn;
    private String author = null;
    private String name = null;

    public Book(String author, String name) {
        this.isbn = counter;
        counter++;
        this.author = author;
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
            "isbn='" + isbn + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author +
            '}';
    }
}
