package org.example.projectjavacore;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapProject {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ragimov", 20);
        map.put("Ruslan", 15);
        map.put("Vladimir", 10);
        map.put("Vladislav", 15);
//        System.out.println(map);
//        map.remove("Ruslan");
//        System.out.println(map);
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Ragimov");
        map1.put(2, "Ruslan");
        map1.put(3, "Vladimir");
        map1.put(4, "Vladislav");
        System.out.println(map1);

        map1.remove(2);
        System.out.println(map1);

    }
}
