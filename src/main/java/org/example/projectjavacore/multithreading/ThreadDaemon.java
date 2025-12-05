package org.example.projectjavacore.multithreading;

public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thred-" + Thread.currentThread().getName());
            }

        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);

    }
}
