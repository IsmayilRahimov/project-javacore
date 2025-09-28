package org.example.projectjavacore.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sproject {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Lifo Last in first out
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        Queue<Integer> num = new LinkedList<>();  // Fifo first in first out
        num.add(1);
        num.add(2);
        num.add(3);
        num.poll();
        num.poll();
        System.out.println(num);
    }
}
