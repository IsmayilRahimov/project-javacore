package org.example.projectjavacore.integer;

public class ProjectInteger {
    public static void main(String[] args) {
//        Integer a = 127;
//        Integer b = 127;
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

        String a = "123";
        String b = "123";
        System.out.println(a == b);  // true
        System.out.println(a.equals(b));  // true

        String c = new String("123");
        String f = new String("123");
        System.out.println(c == f);  // false
        System.out.println(c.equals(f)); // true

        String j = "123";
        String k = new String("123");
        System.out.println(j == k);  // false
        System.out.println(j.equals(k));  // true
    }
}
