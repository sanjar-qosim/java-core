package lesson_11.first_task;

public class Subscriber implements Runnable {

    Message message;
    private final String name;

    public Subscriber(Message message, String name) {
        this.message = message;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            message.getMessage(this.name);
        }
    }
}
