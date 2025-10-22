package lesson_11.second_task;

public class Task1 extends Thread {

    private final SimpleThreadPool pool;

    public Task1(String name, SimpleThreadPool pool) {
        super(name);
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            Runnable task = pool.getTask();
            if (task == null) {
                break;
            }
            try {
                task.run();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
