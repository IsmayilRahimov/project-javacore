package org.example.projectjavacore.design;

public class BankPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Bank payment " + amount + " odenildi :");
    }
}
