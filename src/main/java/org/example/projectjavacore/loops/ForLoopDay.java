package org.example.projectjavacore.loops;

public class ForLoopDay {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);

        }
        for (int a = 1; a <= 5; a++) {
            if (a == 3) {
                continue;
            }
            System.out.println(a);
        }
    }
}
