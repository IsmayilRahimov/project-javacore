package org.example.projectjavacore.constructors;

public class Child extends Parents {
    @Override
    public void show() {
        super.show();
        System.out.println("Child show");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
