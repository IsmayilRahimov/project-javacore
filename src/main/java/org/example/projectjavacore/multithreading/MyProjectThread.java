package org.example.projectjavacore.multithreading;

public class MyProjectThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyProjectThread run");
    }

    public static void main(String[] args) {
        MyProjectThread thread = new MyProjectThread();
        thread.start();
        Thread thread1 = new Thread(new MProjectRunnab());
        thread1.start();

    }
}
