package org.example.projectjavacore.multithreading;

public class ThirdWay {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {  // anonymous class
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My thread is running");
            }

        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
