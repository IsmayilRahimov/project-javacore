package org.example.projectjavacore.solid.interfaceSegregationPrinciple;

public class Chicken implements Eating, Runing {
    @Override
    public void eating() {
        System.out.println("Chicken eating");
    }

    @Override
    public void run() {
        System.out.println("Chicken run");
    }
}
