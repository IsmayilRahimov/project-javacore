package org.example.projectjavacore.internpattern;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil et: ");
        int a = sc.nextInt();
        System.out.print("İkinci ədədi daxil et: ");
        int b = sc.nextInt();
        System.out.print("Üçüncü ədədi daxil et: ");
        int c = sc.nextInt();

        int max = a; // əvvəlcə max = a qəbul edirik
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Ən böyük ədəd: " + max);
    }
}

