package lesson_11.second_task;

public class Task1 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": hello from thread");
    }
}
