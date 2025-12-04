package org.example.projectjavacore.handler;

public class AgeOfMin {

    public static void showAge(int age) throws AgeLowException {
        if (age <= 18) {
            throw new AgeLowException("Invalid age");
        }
        System.out.println(age + " years old");
    }

    public static void main(String[] args) {
        showAge(18);
    }
}
