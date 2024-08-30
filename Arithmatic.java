 package JavaAsignment;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Display results
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println(num2 != 0 ? "Quotient: " + (num1 / num2) + "\nModulus: " + (num1 % num2) : "Division and modulus by zero are not allowed.");

        scanner.close();
    }
}
