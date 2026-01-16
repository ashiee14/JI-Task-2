/**
 * PrimitiveDataTypes.java
 * Demonstrates all Java primitive data types and their memory usage
 */
public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // Integer data types
        byte b = 100;           // 1 byte
        short s = 10000;        // 2 bytes
        int i = 100000;         // 4 bytes
        long l = 1000000000L;   // 8 bytes

        // Floating point data types
        float f = 3.14f;        // 4 bytes
        double d = 3.14159265;  // 8 bytes

        // Character and boolean
        char c = 'A';           // 2 bytes
        boolean bool = true;    // 1 bit (JVM dependent)

        // Printing values
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
    }
}
