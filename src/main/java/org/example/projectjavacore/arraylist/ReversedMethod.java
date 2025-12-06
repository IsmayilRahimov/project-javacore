package org.example.projectjavacore.arraylist;

public class ReversedMethod {
    public static void main(String[] args) {
        String name = "Samira";
        String reversed = "";

        int i = name.length() - 1;
        while (i >= 0) {
            reversed += name.charAt(i);
            i--;
        }
        System.out.println(reversed);
    }
}
