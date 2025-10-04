package org.example.projectjavacore.weak;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashWeak {
    public static void main(String[] args) {
        Map<Object, String> m1 = new HashMap<>();

        Object o1 = new Object();
        m1.put(o1, "Hash Map");
        o1 = null;
        System.gc();
        System.out.println("HashMap after gc" + m1);

        WeakHashMap<Object, String> m2 = new WeakHashMap<>();
        Object o2 = new Object();
        m2.put(o2, "Weak HashMap");
        o2 = null;
        System.gc();
        System.out.println("WeakHashMap after gc" + m2);
    }
}


