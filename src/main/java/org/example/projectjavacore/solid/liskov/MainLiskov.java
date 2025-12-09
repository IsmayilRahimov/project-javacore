package org.example.projectjavacore.solid.liskov;

public class MainLiskov {

    public static void main(String[] args) {
        Canli animal = new Animal();
        Canli human = new Human();

        animal.eating();
        human.eating();
        animal.breath();
        human.breath();
        animal.running();
        human.running();
    }
}
