package org.example.projectjavacore.constructors;


public class ProjectConstructor {

    String name;
    int age;

    public ProjectConstructor(String name, int age) {  // All args constructors
        this.name = name;
        this.age = age;
    }

    public ProjectConstructor() {  // No Args Constructors

    }

    public ProjectConstructor(String name) { // RequiredArgs Constructors
        this.name = name;
    }
}
