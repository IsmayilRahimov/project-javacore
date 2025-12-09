package org.example.projectjavacore.solid.dependencyinversion;

public class MainDependency {

    public static void main(String[] args) {
        Account account = new Account();
        User user = new User();
        Bank bank = new Bank(account,user);
        user.getAllUsers();
        account.getAllAccounts();
    }
}
