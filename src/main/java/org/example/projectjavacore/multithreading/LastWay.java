package org.example.projectjavacore.multithreading;

public class LastWay {

    public static void main(String[] args) {
        Runnable runnable = () -> {

            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
