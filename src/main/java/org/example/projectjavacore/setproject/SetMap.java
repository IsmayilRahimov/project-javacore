package org.example.projectjavacore.setproject;

import java.util.*;

public class SetMap {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Ragimov");
        names.put(2, "Ruslan");
        names.put(3, "Vladimir");
        names.put(4, "Vladislav");
        System.out.println(names);


        List<String> list = new ArrayList<>();
        list.add("Ragimov");
        list.add("Ruslan");
        list.add("Vladimir");
        list.add("Vladislav");
        list.add("Vladimir");

        List<String> list2 = new LinkedList<>();
        list2.add("Ragimov");
        list2.add("Ruslan");
        list2.add("Vladimir");
        list2.add("Vladislav");
        list2.add("Vladimir");

        Set<String> set = new HashSet<>();
        set.add("Ragimov");
        set.add("Ruslan");
        set.add("Vladimir");

        Set<String> set2 = new TreeSet<>();
        set2.add("Ragimov");
        set2.add("Ruslan");
        set2.add("Vladimir");

        Set<String> set3 = new LinkedHashSet<>();


    }
}
