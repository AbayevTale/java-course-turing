package az.edu.turing.module03.lesson8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SheepManager {
    AtomicInteger sheepCount = new AtomicInteger(0);

    Lock lock = new ReentrantLock();

    private void incrementAndReport() {

        lock.lock();
        System.out.print((sheepCount.incrementAndGet()) + " ");
        lock.unlock();

    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}