package org.example.projectjavacore.solid.dependencyinversion;

public class MySQL implements Database {

    @Override
    public void save() {
        System.out.println("Saving MySQL");
    }
}
