package org.example.projectjavacore.genericstimelong;

public class TypeGenericMethods {

    public static <T> void show(T value) {
        System.out.print(value);
    }

    public static void main(String[] args) {

        show("Hello");
        show(new Integer[]{1, 2, 3});
        show(new Integer[]{1, 2, 3});
        show(new Integer[]{1, 2, 3});
    }
}
