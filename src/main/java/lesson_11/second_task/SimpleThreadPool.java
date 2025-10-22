package lesson_11.second_task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class SimpleThreadPool {

    private final int poolSize;
    private final List<Task1> workers;
    private final Queue<Runnable> taskQueue;
    private volatile boolean isShutdown;

    public SimpleThreadPool(int poolSize) {
        this.poolSize = poolSize;
        this.taskQueue = new LinkedList<>();
        this.workers = new LinkedList<>();

        for (int i = 0; i < poolSize; i++) {
            Task1 task1 = new Task1("Task-" + i, this);
            task1.start();
            workers.add(task1);
        }
    }

    public void submit(Runnable task) {
        if (isShutdown) {
            System.out.println("ThreadPool was shutdown!");
        }
        synchronized (taskQueue) {
            taskQueue.offer(task);
            taskQueue.notify();
        }
    }

    public void shutdown() {
        isShutdown = true;
        synchronized (taskQueue) {
            taskQueue.notifyAll();
        }
    }

    Runnable getTask() {
        synchronized (taskQueue) {
            while (taskQueue.isEmpty() && !isShutdown) {
                try {
                    taskQueue.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            if (isShutdown && taskQueue.isEmpty()) {
                return null;
            }
            return taskQueue.poll();
        }
    }

    public boolean isShutdown() {
        return isShutdown;
    }
}
