package org.example.projectjavacore.strategypattern;

public class PayPalPayment implements Strategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " AZN ödəndi PayPal ilə: " + email);
    }
}

