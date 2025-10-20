package lesson_11.first_task;

class Publisher {
    private final Message message;

    public Publisher(Message message) {
        this.message = message;
    }

    public void publish(String text) {
        message.addMessage(text);
    }
}
