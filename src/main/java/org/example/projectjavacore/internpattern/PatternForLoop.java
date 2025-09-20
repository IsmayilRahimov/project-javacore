package org.example.projectjavacore.internpattern;

import java.util.Scanner;

public class PatternForLoop {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
