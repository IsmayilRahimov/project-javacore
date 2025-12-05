package org.example.projectjavacore.multithreading;

import com.sun.tools.javac.Main;

public class StackOrHeap {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        var main = new StackOrHeap();
        var main2 = new StackOrHeap();
        int result = main.sum(a, b);
        User user = new User();
        user.name = "Ali";
        User user2 = user;
        user2.name = "samir";

    }

    public int sum(int a, int b) {
        return a + b;
    }
}
