package lesson_11.second_task;

public class TestTask2 {

    public static void main(String[] args) {
        SimpleThreadPool pool = new SimpleThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is working on " + taskId);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pool.shutdown();
        System.out.println("The pool was stopped");
    }
}
