package org.example.projectjavacore.variables;

public class StudentTest {
    public static void main(String[] args) {
        ConsturctorOOp student = new ConsturctorOOp(20, "Ragimov", 15000.0);
        student.melumatgoster();
        student.maasartir(1000.0);
        System.out.println(student.getPrice());
    }
}
