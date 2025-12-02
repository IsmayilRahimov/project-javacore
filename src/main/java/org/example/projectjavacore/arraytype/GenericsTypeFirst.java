package org.example.projectjavacore.arraytype;

public class GenericsTypeFirst<T, L> {

    private T value;
    private L lime;

    public L getLime() {
        return lime;
    }

    public void setLime(L lime) {
        this.lime = lime;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
    }

    public <T> void show(T value, L lime) {
        if (value != null) {
            throw new RuntimeException("Value is null");
        }
        if (value == lime) {
            throw new RuntimeException("Value == lime");
        }
    }

}
