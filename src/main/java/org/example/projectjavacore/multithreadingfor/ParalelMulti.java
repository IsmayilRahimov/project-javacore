package org.example.projectjavacore.multithreadingfor;


public class ParalelMulti {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("t1 " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("t2 " + i);
            }
        });
        t1.start();
        t2.start();

    }
}
