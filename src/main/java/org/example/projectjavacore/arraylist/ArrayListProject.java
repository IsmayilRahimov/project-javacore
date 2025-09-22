package org.example.projectjavacore.arraylist;

import java.util.ArrayList;

public class ArrayListProject {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // sira ile saxlayir
        list.add("Ragimov");
        list.add("Ruslan");
        list.add("Vladimir");
        list.add("Vladislav");
        list.add("Vladimir");
        System.out.println(list);
        System.out.println(list.contains("Ruslan"));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Ruslan"));
    }
}
