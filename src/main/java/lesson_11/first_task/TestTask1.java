package lesson_11.first_task;

import java.util.Scanner;

public class TestTask1 {

    public static void main(String[] args) {
        Message message = new Message();
        Scanner scanner = new Scanner(System.in);

        Publisher publisher = new Publisher(message);
        Thread subscriber1 = new Thread(new Subscriber(message, "John"));
        Thread subscriber2 = new Thread(new Subscriber(message, "Ivan"));

        subscriber1.start();
        subscriber2.start();

        System.out.println("Enter a publish or enter 'Exit' to exit program:");

        while (true) {
            String text = scanner.nextLine();
            if (text.equalsIgnoreCase("Exit")) {
                subscriber1.interrupt();
                subscriber2.interrupt();
                System.out.println("Exit...");
                break;
            }
            publisher.publish(text);
        }

        scanner.close();
    }

}
