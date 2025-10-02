package org.example.projectjavacore.factory;

public class PaymentFactory {

    public static AccountPay getPayment(String paymentType) {
        if (paymentType.equals("Credit")) {
            return new CreditPayment();
        } else if (paymentType.equals("AzerIsiq")) {
            return new AzerIsiq();
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        AccountPay accountPay = paymentFactory.getPayment("Credit");
        accountPay.pay(100);
    }
}
