package org.example.projectjavacore.genericstimelong;

public interface Repo<T> {
    void save(T item);
    T findById(Integer id);
}
