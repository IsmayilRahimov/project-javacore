package org.example.projectjavacore.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListProject {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();  // burada Linked list ardicil siralanir unikal ola biler
        list.add("Ragimov");
        list.add("Ruslan");
        list.add("Cladimir");
        list.add("Vladislav");
        list.add("aladimir");
        System.out.println(list);
        list.get(0);
        System.out.println(list.get(0));


        Vector<String> vector = new Vector<>();
        vector.add("Ragimov");
        vector.add("Ruslan");
        vector.add("Cladimir");
        vector.add("Vladislav");
        vector.add("aladimir");
        System.out.println(vector);
    }
}
