package org.example.projectjavacore.generics.list;

import java.util.List;

public class Generics {
    public static <T> void print(T data){
        System.out.println(data);
    }
    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static void main(String[] args) {
        Generics.print("Sa");
        Generics.isEqual(10,20);
    }

}
