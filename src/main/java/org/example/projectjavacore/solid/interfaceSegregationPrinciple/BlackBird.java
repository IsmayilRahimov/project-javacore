package org.example.projectjavacore.solid.interfaceSegregationPrinciple;

public class BlackBird implements Eating, Flying {
    @Override
    public void eating() {
        System.out.println("Black Bird eating");
    }

    @Override
    public void flying() {
        System.out.println("Bird flying");
    }
}
