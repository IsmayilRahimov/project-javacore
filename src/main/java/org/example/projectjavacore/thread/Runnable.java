package org.example.projectjavacore.thread;

public class Runnable implements java.lang.Runnable {

    @Override
    public void run() {
        System.out.println("Runnable run");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable());
        thread.start();
    }
}
