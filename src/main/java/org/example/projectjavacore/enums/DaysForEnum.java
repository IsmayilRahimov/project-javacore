package org.example.projectjavacore.enums;

public enum DaysForEnum {

    MONDAY(1),
    SUNDAY(2),
    WEDNESDAY(3);

    private int day;

     DaysForEnum(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

}
