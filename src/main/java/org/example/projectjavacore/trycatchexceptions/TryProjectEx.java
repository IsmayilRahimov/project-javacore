package org.example.projectjavacore.trycatchexceptions;

public class TryProjectEx {
    public static void main(String[] args) {
//        try {
//            int a = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Xeta bas verdi :" + e.getMessage());
//        }

        try {
            int a = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi :" + e.getMessage());
        } finally {
            System.out.println("Bu blok her zaman isleyir: ");
        }
    }
}
