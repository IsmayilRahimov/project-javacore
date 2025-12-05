package org.example.projectjavacore.multithreading;

public class SecondWay implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread is running"); // runing
        System.out.println("My thread is finished");
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SecondWay()); // new state
        Thread t2 = new Thread(new SecondWay());
        t1.start(); //runnable
        t2.start();
    }
}
