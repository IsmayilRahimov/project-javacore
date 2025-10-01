package org.example.projectjavacore.multithreading;

public class MyProThr extends Thread {

    @Override
    public void run() {
        System.out.println("MyProThr run");
    }

    public static void main(String[] args) {
        MyProThr myProThr = new MyProThr();
        myProThr.start();
    }
}
