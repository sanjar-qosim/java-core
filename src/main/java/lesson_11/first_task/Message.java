package lesson_11.first_task;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private List<String> messages = new ArrayList<>();
    int count = 0;

    public synchronized void addMessage(String text){
        messages.add(text);
        notifyAll();
    }

    public synchronized void getMessage(String name) {
        while (messages.size() == count) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String msg = messages.get(count);
        count++;
        System.out.println(name + ": " + msg);
        notifyAll();
    }
}
