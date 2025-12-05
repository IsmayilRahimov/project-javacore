package org.example.projectjavacore.multithreadingfor;

public class SafeCounter {

    private static int count = 0;

    public synchronized static void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = SafeCounter::increment;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) increment();
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) increment();
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count + "final count = " + count);

    }
}

