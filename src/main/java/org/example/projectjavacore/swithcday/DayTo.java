package org.example.projectjavacore.swithcday;

import java.util.Scanner;

public class DayTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa gunu qeyd edin");
        int gun = scanner.nextInt();


        switch (gun) {
            case 1 -> System.out.println("Bazar ertesi");
            case 2 -> System.out.println("Cersenbe axsami");
            case 3 -> System.out.println("Cersenbe axsami");
            default -> System.out.println("Namelum gun");
        }
    }
}
