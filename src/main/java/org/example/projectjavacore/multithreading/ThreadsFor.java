package org.example.projectjavacore.multithreading;

public class ThreadsFor {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My thread is running ");

        };

        Thread thread = new Thread(runnable, "First Thread");
        Thread thread1 = new Thread(runnable, "Second Thread");
        thread.start();
        Thread.sleep(20000);
        thread1.start();
        Thread.sleep(10000);
    }
}
