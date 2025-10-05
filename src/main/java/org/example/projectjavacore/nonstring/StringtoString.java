package org.example.projectjavacore.nonstring;

public class StringtoString {
    public static void main(String[] args) {
        String str = "123";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
