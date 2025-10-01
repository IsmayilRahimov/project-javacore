package org.example.projectjavacore.strategypattern;

public class ShoppingCart {
    private Strategy paymentStrategy;

    // Runtime-da strategiyanı seçirik
    public void setPaymentStrategy(Strategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

