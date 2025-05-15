package az.edu.turing.module03.lesson8;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            new Thread(new MyRunnable()).start();
        }
    }

}

class MyRunnable implements Runnable {
    static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("Count is " + counter.incrementAndGet() + " " + Thread.currentThread().getName());
    }

}