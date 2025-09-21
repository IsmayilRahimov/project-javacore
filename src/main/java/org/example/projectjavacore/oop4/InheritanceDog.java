package org.example.projectjavacore.oop4;

public class InheritanceDog extends Animal {

    String food;

    public String eat(String food) {
        System.out.println("Dog eat" + food);
        return food;
    }

    @Override
    public void eat() {
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }

    public static void main(String[] args) {
        InheritanceDog dog = new InheritanceDog();
        dog.eat();
        dog.sleep();
        dog.eat("fish");
    }
}
