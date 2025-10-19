package lesson_11.first_task;

public class Publisher implements Runnable {

    Message message;

    public Publisher(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            message.addMessage("hello");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
