package org.example.projectjavacore.design;

public class MainPayment {
    public static void main(String[] args) {

        Payment payment = new AzGoldPayment();
        payment.pay(100);
        payment = new BankPayment();
        payment.pay(200);
    }
}
