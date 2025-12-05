package org.example.projectjavacore.multithreading;

public class DecrementThread extends Thread {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            counter.decrement();
        }
    }
}
