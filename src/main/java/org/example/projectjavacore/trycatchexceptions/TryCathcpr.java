package org.example.projectjavacore.trycatchexceptions;

public class TryCathcpr {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Xeta yoxdur: ");
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi :" + e.getMessage());
        } finally {
            System.out.println("Bu blok her zaman isleyir: ");
        }
    }
}
