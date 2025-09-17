package org.example.projectjavacore.overloading;

public class KamazOverload {

    String transport(String qum) {
        return "Kamaz  " + qum + " dasiyir";

    }

    String transport(String qum, String das) {
        return "Kamaz  " + qum + " ve " + das + " dasiyir";
    }

    public static void main(String[] args) {
        KamazOverload kamazOverload = new KamazOverload();
        String first = kamazOverload.transport("qum");
        System.out.println(first);
        String second = kamazOverload.transport("qum", "das");
        System.out.println(second);
    }
}
