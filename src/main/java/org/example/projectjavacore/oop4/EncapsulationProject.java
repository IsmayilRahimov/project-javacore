package org.example.projectjavacore.oop4;

public class EncapsulationProject {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        EncapsulationProject person = new EncapsulationProject();
        person.setName("Ragimov");
        person.setAge(20);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
