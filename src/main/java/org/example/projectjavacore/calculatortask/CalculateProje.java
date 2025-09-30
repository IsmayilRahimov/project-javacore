package org.example.projectjavacore.calculatortask;

import java.util.Scanner;

public class CalculateProje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Firs add number: ");
            int number1 = scanner.nextInt();

            System.out.println("Second add number: ");
            int number2 = scanner.nextInt();

            System.out.println("Operator check: + - / * ");
            char operator = scanner.next().charAt(0);


            int result = 0;
            boolean validoperator = true;

            if (operator == '+') {
                result = number1 + number2;
            } else if (operator == '-') {
                result = number1 - number2;
            } else if (operator == '*') {
                result = number1 * number2;
            } else if (operator == '/') {
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Can't divide by zero");
                    validoperator = false;
                }

            } else {
                System.out.println("Check operator");
                validoperator = false;

            }
            if (validoperator) {
                System.out.println("Result: " + result);
            }
            System.out.println("Try again?");
            String answer = scanner.next();
            if (answer.equals("no")) {
                break;
            }

            scanner.close();

        }
    }
}
