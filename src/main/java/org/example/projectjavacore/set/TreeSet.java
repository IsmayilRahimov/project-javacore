package org.example.projectjavacore.set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> setname = new java.util.TreeSet<>();  // setde Elifba sirasiyla adlar cap olunur
        setname.add("Ragimov");
        setname.add("Cavadov");
        setname.add("Valiyev");
        setname.add("Musayev");
        System.out.println(setname);

        Set<Integer> num = new java.util.TreeSet<>(); // artan sirayla
        num.add(1);
        num.add(5);
        num.add(3);
        num.add(2);
        System.out.println(num);
    }
}
