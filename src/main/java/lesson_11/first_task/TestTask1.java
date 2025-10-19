package lesson_11.first_task;

public class TestTask1 {

    public static void main(String[] args) {

        Message message = new Message();

        Thread publisher = new Thread(new Publisher(message));
        Thread subscriber1 = new Thread(new Subscriber(message, "John"));
        Thread subscriber2 = new Thread(new Subscriber(message, "Ivan"));

        publisher.start();
        subscriber1.start();
        subscriber2.start();
    }
}
