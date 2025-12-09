package org.example.projectjavacore.solid.liskov;

public class Animal implements Canli {
    @Override
    public void eating() {
        System.out.println("Animal eating");
    }

    @Override
    public void running() {
        System.out.println("Animal running");

    }

    @Override
    public void breath() {
        System.out.println("Animal breath");

    }
}
