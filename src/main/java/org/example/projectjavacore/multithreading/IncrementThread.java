package org.example.projectjavacore.multithreading;

public class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
           counter.increment();
        }
    }
}
