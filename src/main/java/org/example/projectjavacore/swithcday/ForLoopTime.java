package org.example.projectjavacore.swithcday;

public class ForLoopTime {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            System.out.println(i + " saat");
        }
        System.out.println("Bitti");

        int a = 0;
        while (a < 24) {
            System.out.println(a + " saat");
            a++;
        }
        System.out.println("Bitti");

        do {
            System.out.println("Do while");
            a++;
        } while (a < 24);
    }
}
