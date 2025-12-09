package org.example.projectjavacore.solid.dependencyinversion;

public class UserService {

    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    void saveUser() {
        database.save();
    }
}
