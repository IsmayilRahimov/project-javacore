package org.example.projectjavacore.enums;

import java.util.Scanner;

public enum Week {

    MONDAY("1-ci gun"),
    TUESDAY("2-ci gun"),
    WEDNESDAY("3-cu gun"),
    THURSDAY("4-cu gun");

    private String name;

    Week(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        for (Week w : Week.values()) {
            System.out.println(w + " " + w.name);
        }


        Scanner sc = new Scanner(System.in);
        Week weeks = Week.valueOf(sc.nextLine());


        switch (weeks) {
            case MONDAY:
                System.out.println(MONDAY.name);
                break;
            case TUESDAY:
                System.out.println(TUESDAY.name);
                break;
            case WEDNESDAY:
                System.out.println(WEDNESDAY.name);
                break;
            case THURSDAY:
                System.out.println(THURSDAY.name);
                break;
            default:
                System.out.println("Invalid week");
                break;

        }
    }
}
