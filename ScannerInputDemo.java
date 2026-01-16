import java.util.Scanner;

/**
 * ScannerInputDemo.java
 * Demonstrates accepting multiple types of user input using Scanner
 */
public class ScannerInputDemo {

    public static void main(String[] args) {

        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        // Accept integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Accept float input
        System.out.print("Enter your height (in meters): ");
        float height = sc.nextFloat();

        // Accept string input
        sc.nextLine(); // Clear buffer
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Accept boolean input
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Display inputs
        System.out.println("\n----- User Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);

        // Close scanner
        sc.close();
    }
}
