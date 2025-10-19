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
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(name + ": " + messages.getLast());
        notify();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
