package org.example.projectjavacore.integer;

public class StringBufferProject {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ragimov");
        sb.append(" Ragimov");
        System.out.println(sb);
        String a = "Java";
         a.concat(" is the best programming language");
        System.out.println(a);
        StringBuilder sb1 = new StringBuilder("Masha");
        sb1.append(" Ayi");
        System.out.println(sb1);
    }
}
