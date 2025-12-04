package org.example.projectjavacore.multithreadingfor;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running thread -" + Thread.currentThread().getName());
        System.out.println("Running thread -" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("Running thread -" + Thread.currentThread().getThreadGroup().getParent().getName());
//        System.out.println("Running thread -" + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
//        System.out.println("Running thread -" + Thread.currentThread().getThreadGroup().getParent().getParent().getParent().getName());

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
    }
}
