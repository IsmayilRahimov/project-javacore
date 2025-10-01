package org.example.projectjavacore.bankaccount;

public class MainAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread kafe = new Thread(() -> bankAccount.withdraw("Kafe", 600));
        Thread magaza = new Thread(() -> bankAccount.withdraw("Magaza", 1000));
        kafe.start();
        magaza.start();

    }
}
