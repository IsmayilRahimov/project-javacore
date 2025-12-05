package org.example.projectjavacore.multithreading;

public class FirstWay extends Thread {
    @Override
    public void run() {
        System.out.println("First Thread"); //runing
        System.out.println(getName());
    }

    public static void main(String[] args) {
        FirstWay obj = new FirstWay();
        obj.start(); // runnable
        obj.getThreadGroup().getName();
    }
}
