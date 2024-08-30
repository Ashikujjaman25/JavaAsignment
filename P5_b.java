 
package JavaAsignment;
 
import java.util.Scanner;

public class P5_b {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Taking input for 'n'
        System.out.print("Enter a number: ");
        int n = inputScanner.nextInt();
        inputScanner.close();

        // Generating the pattern
        printPattern(n);
    }

    // Method to print the pattern
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i)); // Print leading spaces
            System.out.println("*".repeat(i));   // Print stars
        }
    }
}

