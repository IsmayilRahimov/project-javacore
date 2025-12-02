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
        if (value == null) {
            throw new RuntimeException("Value is null");
        }
        if (value != lime) {
            throw new RuntimeException("Value == lime");
        }
    }

    public static void main(String[] args) {

        GenericsTypeFirst<Integer, Integer> main = new GenericsTypeFirst<>();
        try {
            main.setValue(1);
            main.setLime(2);
            main.show(1, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
