package org.example.projectjavacore.variables;

public class ConsturctorOOp {
    private int age;
    private String name;
    private double price;

    public ConsturctorOOp(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public void melumatgoster() {
        System.out.println("Adiniz: " + name);
        System.out.println("Yasiniz: " + age);
        System.out.println("Maasiniz: " + price);
    }

    public void maasartir(double artim) {
        price += artim;
        System.out.println("Maasiniz artirildi: " + price);


    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}







