package lesson_8;

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
        Book book = new Book();
        book.addBook("Ivan", "War 2");
        book.addBook("John", "Java Language");
        book.showAllBooks();
    }
}
