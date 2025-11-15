package org.example.projectjavacore.enums;


// ordinal methodu constantin indexini qaytarir:

public enum Season {
    SPRING("Yaz"),
    SUMMER("Yay"),
    WINTER("Qis"),
    FALL("Payiz");


    private String name;


    Season(String name) {
        this.name = name;

    }


    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " - " + season.name);
        }

        System.out.println(Season.valueOf("SPRING"));
        System.out.println(Season.valueOf("SUMMER").ordinal());
        System.out.println(Season.valueOf("WINTER").ordinal());


    }

}
