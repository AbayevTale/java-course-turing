package az.edu.turing.module03.lesson8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolParallelDemo {

    public static void main(String[] args) throws InterruptedException {
        int numberOfTasks = 10;
        int threadPoolSize = 4;

        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);

        long start = System.currentTimeMillis();

        for (int i = 1; i <= numberOfTasks; i++) {
            int taskId = i;
            executor.submit(

                    () -> {
                System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " finished by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        long end = System.currentTimeMillis();
        System.out.println("Total execution time: " + (end - start) / 1000.0 + " seconds");
    }
}