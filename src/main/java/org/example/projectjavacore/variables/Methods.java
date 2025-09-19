package org.example.projectjavacore.variables;

public class Methods {
    public static void salamVer() {
        System.out.println("Salam Hamiya");
    }

    public static void salamVer(String name) {
        System.out.println("Salam " + name);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double ortalama(double a, double b) {
        return (a + b) / 2;
    }


    public static void main(String[] args) {
        salamVer();
        salamVer("Ragimov");
        System.out.println(sum(10, 20));
        System.out.println(ortalama(10.0, 20.0));
    }
}
