package org.example.projectjavacore.factory;

public class AzerIsiq implements AccountPay{
    @Override
    public void pay(int amount) {
        System.out.println("AzerIsiq " + amount + " odenildi :");
    }
}
