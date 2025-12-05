package org.example.projectjavacore.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My thread is running " + Thread.currentThread().getName());
        };

        Runnable runnable1 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My thread is running " + Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable, "First Thread ");
        thread.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
