import java.util.Scanner;

/**
 * InputValidationDemo.java
 * Demonstrates handling invalid input using conditional checks
 */
public class InputValidationDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept integer input
        System.out.print("Enter your age: ");

        // Check if input is an integer
        if (sc.hasNextInt()) {
            int age = sc.nextInt();

            // Check for valid age range
            if (age > 0 && age <= 120) {
                System.out.println("Valid age entered: " + age);
            } else {
                System.out.println("Invalid age! Age must be between 1 and 120.");
            }

        } else {
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        sc.close();
    }
}
