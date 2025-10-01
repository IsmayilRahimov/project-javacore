package org.example.projectjavacore.strategypattern;

public class CreditCartStrategy implements Strategy {

    private String cardNumber;

    public CreditCartStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " AZN ödəndi Kredit Kartı ilə: " + cardNumber);
    }
}


