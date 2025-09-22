package org.example.projectjavacore.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetProject {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();  // hashset eyni adlar olmur unikaldir:
        set.add("Ragimov");
        set.add("Ruslan");
        set.add("Vladimir");
        set.add("Vladislav");
        set.add("Vladimir");
        System.out.println(set);
        set.remove("Ruslan");

        List<String> list = new ArrayList<>();
        list.add("Ragimov");
        list.add("Ruslan");
        list.add("Vladimir");
        list.add("Vladislav");
        list.add("Vladimir");
        System.out.println(list);
        list.remove("Ruslan");
        System.out.println(list);
    }
}
