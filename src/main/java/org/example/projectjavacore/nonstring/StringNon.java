package org.example.projectjavacore.nonstring;

public class StringNon {
    public static void main(String[] args) {
        String str1 = "Hello";
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println(reversed);

        for (int i = reversed.length() - 1; i >= 0; i--) {
            reversed += reversed.charAt(i);
        }
        System.out.println(reversed);
    }
}
