/**
 * FormattedOutputDemo.java
 * Demonstrates formatted output using System.out.printf
 */
public class FormattedOutputDemo {

    public static void main(String[] args) {

        int id = 101;
        String name = "Aishwarya";
        int age = 21;
        double percentage = 88.7564;

        // Printing formatted output
        System.out.printf("Student ID: %d%n", id);
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Age        : %d years%n", age);
        System.out.printf("Percentage : %.2f%%%n", percentage);
    }
}
