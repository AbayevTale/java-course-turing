package az.edu.turing.module03.lesson8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 " + Thread.currentThread().getName());
        };

        Callable<String> task2 = () -> {
            System.out.println("Task 2 " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return "Task 2";
        };

        executorService.execute(task1);
        Future<?> result = executorService.submit(task2);
        System.out.println(result.isDone());
        System.out.println(Thread.currentThread().getName());
        System.out.println(result.get(1, TimeUnit.SECONDS));
        executorService.submit(task1);
        System.out.println(result.isDone());
        executorService.shutdown();


    }


}

