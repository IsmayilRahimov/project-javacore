package org.example.projectjavacore.enums;

import java.util.Scanner;

public enum Days {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Days day = Days.valueOf(input.nextLine());

        switch (day) {
            case MONDAY:
                System.out.println(Days.MONDAY.ordinal());
                break;
            case TUESDAY:
                System.out.println(Days.TUESDAY.ordinal());
                break;
            case WEDNESDAY:
                System.out.println(Days.WEDNESDAY.ordinal());
                break;
            case THURSDAY:
                System.out.println(Days.THURSDAY.ordinal());
                break;
            case FRIDAY:
                System.out.println(Days.FRIDAY.ordinal());
                break;
            case SATURDAY:
                System.out.println(Days.SATURDAY.ordinal());
                break;
            case SUNDAY:
                System.out.println(Days.SUNDAY.ordinal());
            default:
                break;
        }
    }
}
