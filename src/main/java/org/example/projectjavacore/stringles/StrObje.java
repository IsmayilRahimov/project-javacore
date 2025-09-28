package org.example.projectjavacore.stringles;

public class StrObje {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java").intern();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
