package org.example.projectjavacore.genericstimelong;

public class TypeGenerics<T> {

    private T[] arr;

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        TypeGenerics<Integer> generic = new TypeGenerics<>();
        generic.setArr(new Integer[]{1, 2, 3});
        generic.setArr(new Integer[]{1, 2, 3});
        generic.setArr(new Integer[]{1, 2, 3});
        generic.setArr(new Integer[]{1, 2, 3});
        generic.getArr();
        System.out.print(generic.getArr());


    }
}
