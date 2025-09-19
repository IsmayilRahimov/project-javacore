package org.example.projectjavacore.ooppolymorphism;

public class PaymentImpl implements Payment {
    @Override
    public void pay() {
        System.out.println("PaymentImpl pay");
    }
}
