package org.example.projectjavacore.multithreading;

public class RunProjec implements Runnable {

    @Override
    public void run() {
        System.out.println("RunProjec run");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunProjec());
        thread.start();
    }
}
