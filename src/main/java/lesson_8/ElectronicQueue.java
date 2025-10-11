package lesson_8;

import java.util.LinkedList;
import java.util.Queue;

public class ElectronicQueue {

    private Queue<String> users = new LinkedList<>();

    public void addUser(String name){
        users.offer(name);
    }

    public void deleteFirstUser(){
        users.poll();
    }

    @Override
    public String toString() {
        return "ElectronicQueue{" +
            "users=" + users +
            '}';
    }
}
