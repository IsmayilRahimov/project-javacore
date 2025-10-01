package org.example.projectjavacore.bankaccount;

public class BankAccount {

    private double balance = 1500;

    public synchronized void withdraw(String threadName, double amount) {

        if (balance >= amount) {
            System.out.println(threadName + " emeliyyati ishe dushdu :  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " emeliyyati bitdi  :  Balans -  " + balance);
            System.out.println("---------------------------------------");
        } else {
            System.out.println( threadName+  " emeliyyati ishe dushmedi: Balans kifayet etmir: ");
        }
    }
}
