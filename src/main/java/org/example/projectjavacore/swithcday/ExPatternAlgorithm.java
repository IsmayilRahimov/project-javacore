package org.example.projectjavacore.swithcday;

import java.util.Scanner;

public class ExPatternAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scanner.nextInt();
        for (int i = number; i >= 1; --i) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
