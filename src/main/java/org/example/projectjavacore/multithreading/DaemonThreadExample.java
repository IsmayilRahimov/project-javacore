package org.example.projectjavacore.multithreading;

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Runing " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        thread.join();

    }
}
