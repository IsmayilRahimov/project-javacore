package org.example.projectjavacore.nulloptional;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.empty();
        System.out.println(optionalString.get());
        Optional<String> optionalString2 = Optional.ofNullable(null);
        System.out.println(optionalString2.get());
    }
}
