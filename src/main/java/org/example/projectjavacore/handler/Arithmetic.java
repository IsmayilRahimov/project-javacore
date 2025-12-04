package org.example.projectjavacore.handler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Arithmetic {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Xeta bas verdi : " +
                    e.getMessage());
            log.error("Xeta bas verdi : " + e.getMessage());
        }
        System.out.println("Proqram davam etsn:");

    }
}
