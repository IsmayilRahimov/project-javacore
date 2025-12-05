package org.example.projectjavacore.multithreadingfor;

public class FirstWay extends Thread {

    @Override
    public void run() {
        System.out.println("My Thread is running"); // running
        System.out.println("My Thread finished");
    }

    public static void main(String[] args) {
        FirstWay firstWay = new FirstWay();
        firstWay.start(); //runnable
    }
}
