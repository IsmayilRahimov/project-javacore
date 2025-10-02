package org.example.projectjavacore.factory;

public class CreditPayment implements AccountPay {

    @Override
    public void pay(int amount) {
        System.out.println("Credit payment " + amount + " odenildi :");
    }
}
