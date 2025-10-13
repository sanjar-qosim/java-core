package lesson_8;

import java.util.HashMap;
import java.util.Map;

public class TestLesson8 {

    public static void main(String[] args) {
        // Task 1
        ElectronicQueue electronicQueue = new ElectronicQueue();
        electronicQueue.addUser("John");
        electronicQueue.addUser("Ivan");
        electronicQueue.addUser("Alex");

        System.out.println(electronicQueue);
        electronicQueue.deleteFirstUser();
        System.out.println(electronicQueue);
        electronicQueue.deleteFirstUser();
        System.out.println(electronicQueue);

        // Task 2
        ParseUniqueInt parseUniqueInt = new ParseUniqueInt();
        parseUniqueInt.addNumbers();

        // Task 3
        Book book1 = new Book("Ivan", "War 2");
        Book book2 = new Book("Ivan", "War 3");
        Book book3 = new Book("Petr", "Agent");

        AllBooks.addBook(book1);
        AllBooks.addBook(book2);
        AllBooks.addBook(book3);

        AllBooks.showAllBooks();
    }
}
