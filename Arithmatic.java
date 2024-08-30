 
package JavaAsignment;
 

 import java.util.Scanner;

public class Arithmatic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  user input for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform all operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN; // Division, checking for division by zero
        double modulus = num2 != 0 ? num1 % num2 : Double.NaN;  // Modulus, checking for modulus by zero

        // Display all results
        System.out.println("Results:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + modulus);
        } else {
            System.out.println("Division and modulus by zero are not allowed.");
        }

        scanner.close();
    }
}