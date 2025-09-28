package org.example.projectjavacore.stringperson;

public class Person {
    String name;

    static void changeName(Person person) {
        person.name = "Vladislav";
    }

    static void changeReference(Person person) {
        person = new Person();
        person.name = "Musa";
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Ragimov";


        changeName(a);
        System.out.println(a.name);
    }
}
