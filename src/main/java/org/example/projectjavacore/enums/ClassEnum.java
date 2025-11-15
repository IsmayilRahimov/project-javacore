package org.example.projectjavacore.enums;

import java.util.Scanner;

import static org.example.projectjavacore.enums.Season.WINTER;

public class ClassEnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Season season = Season.valueOf(sc.nextLine());

        switch (season) {
            case SPRING:
                System.out.println("YAZ");
                break;
            case SUMMER:
                System.out.println("YAY");
                break;
            case WINTER:
                System.out.println("Qish");
                break;
            default:
                System.out.println("Invalid Season");
                break;
        }

    }


    enum Season {

        WINTER("Qish"),
        SPRING("Yaz"),
        FALL("Payiz"),
        SUMMER("Yay");

        private String name;

        Season(String name) {
            this.name = name;
        }
    }
}
