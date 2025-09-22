package org.example.projectjavacore;

public class Stringbuilde {
    public static void main(String[] args) {
        String s = "Ismayil";
        s = s + " Ragimov ";
        System.out.println(s);
        s.concat(" Ragimov A");

        StringBuilder sb = new StringBuilder("Masha");
        sb.append(" Ayi");
        System.out.println(sb);


        String a = "Java";

        a = a.concat(" is the best programming language");
        System.out.println(a);


    }
}
