package org.example.projectjavacore.designpatterns;

public class SingleProPat {
    private static SingleProPat instance;
    private SingleProPat() {
    }

    public static SingleProPat getInstance() {
        if (instance == null) {
            instance = new SingleProPat();
        }
        return instance;
    }

    public void show() {
        System.out.println("SingleProPat show");
    }
}
