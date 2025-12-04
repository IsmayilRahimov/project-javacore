package org.example.projectjavacore.handler;

public class ThrowMain {

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero" );
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        divide(5, 0);
    }
}
