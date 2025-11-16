package org.example.projectjavacore.enums;

public class ObjectClass {

    public String name;
    public int age;
    Colors color;

    public ObjectClass(String name, int age, Colors color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Person name: " + name + ", age: " + age + ", color: " + color;
    }

    public static void main(String[] args) {
        ObjectClass o1 = new ObjectClass("Julia", 18, Colors.BLACK);
        System.out.println(o1.toString());

    }


}
