package org.example.projectjavacore.optional;

import java.util.Optional;

public class NullOptional {

    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("Hello");
//        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
//        Optional<String> empty = Optional.empty();
//        System.out.println(empty.isPresent());
//        Optional<String> empty2 = Optional.ofNullable(null);
//        System.out.println(empty2.isPresent());
        Optional<String> empty3 = Optional.ofNullable(null);
        System.out.println(empty3.isPresent());

        try {


            Optional<String> empty4 = Optional.ofNullable("");
            System.out.println(empty4.isPresent());
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
