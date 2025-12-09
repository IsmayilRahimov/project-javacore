package org.example.projectjavacore.solid.dependencyinversion;

public class MainUserService {

    public static void main(String[] args) {
        Database database = new MySQL();
        UserService userService = new UserService(database);
        userService.saveUser();
    }
}
