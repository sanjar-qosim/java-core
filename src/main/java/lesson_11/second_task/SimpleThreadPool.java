package lesson_11.second_task;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SimpleThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread starts...\n");

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task1());
        }

        executorService.shutdown();
    }
}
