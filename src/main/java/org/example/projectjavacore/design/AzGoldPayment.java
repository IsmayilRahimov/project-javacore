package org.example.projectjavacore.design;

public class AzGoldPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Az Gold payment " + amount + " odenildi :");
    }
}
