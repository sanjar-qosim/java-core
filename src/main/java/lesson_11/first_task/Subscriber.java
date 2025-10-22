package lesson_11.first_task;

public class Subscriber implements Runnable {

    private final Message message;
    private final String name;

    public Subscriber(Message message, String name) {
        this.message = message;
        this.name = name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            message.getMessage(this.name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
