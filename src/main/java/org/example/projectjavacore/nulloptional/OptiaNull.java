package org.example.projectjavacore.nulloptional;

import java.util.Optional;

public class OptiaNull {
    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable(null);
        String empty1 = empty.orElseGet(() -> "Empty");
        System.out.println(empty1);
        Optional<String> empty2 = Optional.ofNullable(null);

        try {


            String empty3 = empty2.orElseThrow(() -> new NullPointerException());
            System.out.println(empty3);
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
