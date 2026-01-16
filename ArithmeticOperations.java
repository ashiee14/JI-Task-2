import java.util.Scanner;

/**
 * ArithmeticOperations.java
 * Performs basic arithmetic operations using user input
 */
public class ArithmeticOperations {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Accept user inputs
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

            if(op=='+') 
            {
                int sum = num1 + num2;
                System.out.println("Result: " + sum);
            } 
            else if(op=='-') 
            {
                int difference = num1 - num2;
                System.out.println("Result: " + difference);
            } 
            else if(op=='*') 
            {
                int product = num1 * num2;
                System.out.println("Result: " + product);
            } 
            else if(op=='/') 
            {
                if(num2 != 0) 
                {
                    int quotient = num1 / num2;
                } 
                else 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } 
            else if(op=='%') 
            {
                int remainder = num1 % num2;
                System.out.println("Result: " + remainder);
            }
            else 
            {
                System.out.println("Invalid operator.");
            }
        
        // Close Scanner
        sc.close();
    }
}
