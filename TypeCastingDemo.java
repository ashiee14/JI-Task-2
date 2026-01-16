/**
 * TypeCastingDemo.java
 * Demonstrates compatible and incompatible type casting in Java
 */
public class TypeCastingDemo {

    public static void main(String[] args) {

        // --------- Widening Casting (Implicit) ---------
        int intValue = 50;
        double doubleValue = intValue;  // int → double

        System.out.println("Widening Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        // --------- Narrowing Casting (Explicit) ---------
        double price = 99.99;
        int roundedPrice = (int) price; // double → int

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + price);
        System.out.println("int value after casting: " + roundedPrice);

        // --------- Incompatible Type Casting ---------
        String numberStr = "123";
        int number = Integer.parseInt(numberStr); // String → int

        System.out.println("\nIncompatible Casting:");
        System.out.println("String value: " + numberStr);
        System.out.println("Integer value: " + number);

        // int → String conversion
        int marks = 90;
        String marksStr = String.valueOf(marks);

        System.out.println("String from int: " + marksStr);
    }
}
