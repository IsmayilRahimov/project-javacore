package org.example.projectjavacore.enums;

public class Person {

    EnumPerson NAME;
    EnumPerson AGE;
    EnumPerson COLOR;


    public Person(EnumPerson NAME, EnumPerson AGE, EnumPerson COLOR) {
        this.NAME = NAME;
        this.AGE = AGE;
        this.COLOR = COLOR;
    }

    @Override
    public String toString() {
        return "Person{" +
                "NAME=" + NAME +
                ", AGE=" + AGE +
                ", COLOR=" + COLOR +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(EnumPerson.NAME, EnumPerson.AGE, EnumPerson.EMAIL);
        System.out.println(person);
    }
}
