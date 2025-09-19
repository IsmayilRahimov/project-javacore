package org.example.projectjavacore.variables;

public class ArraysAndStrings {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Ragimov", "Murat", "Ali", "Ahmet"};
        System.out.println(numbers);
        System.out.println(names);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + " Value: " + numbers[i] + "");
        }

        String metn = "Java learned me to write";
        System.out.println("String Methods");
        System.out.println("Uzunluq " + metn.length());
        System.out.println("Boyuk herf " + metn.toUpperCase());
        System.out.println("Kucuk herf " + metn.toLowerCase());
        System.out.println("Birinci harfi " + metn.charAt(0));
        System.out.println("Java sozu varmi? " + metn.contains("Java"));


        System.out.println("n/adlar");

        for (String name : names) {
            System.out.println(name);

        }
    }
}
