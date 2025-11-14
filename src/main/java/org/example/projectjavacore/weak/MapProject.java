package org.example.projectjavacore.weak;

import java.util.*;

public class MapProject {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ragimov", 20);
        map.put("Ruslan", 15);
        map.put("Vladimir", 10);
        map.put("Vladislav", 15);
        System.out.println(map);
        map.remove("Ruslan");
        System.out.println(map);
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Ragimov");
        map1.put(2, "Ruslan");
        map1.put(3, "Vladimir");
        map1.put(4, "Vladislav");
        System.out.println(map1);

        map1.remove(2);
        System.out.println(map1);

        Collection<String> col = new LinkedList<>();

        col.add("Ragimov");
        col.add("Ruslan");
        col.add("Vladimir");
        col.add("Vladislav");
        System.out.println(col);
        col.remove("Ruslan");
        System.out.println(col);

        Set<String> set = new HashSet<>();
        set.add("Ragimov");
        set.add("Ruslan");
        set.add("Vladimir");
        set.add("Vladislav");
        System.out.println(set);
        set.remove("Ruslan");
        System.out.println(set);
        Collections.sort(new ArrayList<>(set));
    }
}
