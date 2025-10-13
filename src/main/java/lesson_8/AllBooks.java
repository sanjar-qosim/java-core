package lesson_8;

import java.util.HashMap;
import java.util.Map;

public class AllBooks {

    private static Map<Integer, Book> books = new HashMap<>();

    public static void addBook(Book book) {
        int id = book.getIsbn();
        books.put(id, book);
    }

    public static void showAllBooks() {
        books.forEach((integer, book) -> System.out.println(book));
    }
}
