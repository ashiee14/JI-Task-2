/**
 * VariableTypesDemo.java
 * Demonstrates local, instance, and static variables
 */
public class VariableTypesDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public void showVariables() {

        // Local variable
        int localVar = 30;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {

        // Create first object
        VariableTypesDemo obj1 = new VariableTypesDemo();
        obj1.showVariables();

        // Create second object
        VariableTypesDemo obj2 = new VariableTypesDemo();
        obj2.showVariables();
    }
}
