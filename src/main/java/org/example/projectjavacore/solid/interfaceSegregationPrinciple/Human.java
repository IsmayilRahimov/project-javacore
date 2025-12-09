package org.example.projectjavacore.solid.interfaceSegregationPrinciple;

public class Human implements Eating,Runing {
    @Override
    public void eating() {
        System.out.println("Human.eating()");
    }

    @Override
    public void run() {
        System.out.println("Human.run()");

    }
}
