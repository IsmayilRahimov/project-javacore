package org.example.projectjavacore.oop4;

public class PolymorpishmProject {
    public static void main(String[] args) {
        AnimalP animals = new AnimalP();
        animals.yeyir();
        AnimalP cat = new CatProject();
        cat.yeyir();
        AnimalP dog = new DogProject();
        dog.yeyir();
    }
}
