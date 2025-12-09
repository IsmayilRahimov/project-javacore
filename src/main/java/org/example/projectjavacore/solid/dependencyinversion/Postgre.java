package org.example.projectjavacore.solid.dependencyinversion;

public class Postgre implements Database {
    @Override
    public void save() {
        System.out.println("Saving Postgre");
    }
}
