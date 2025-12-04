package org.example.projectjavacore.multithreadingfor;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Running thread -" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
