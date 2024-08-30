 
package JavaAsignment;
 
 
import java.util.Scanner;

public class P5_d {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter Your Number: ");
        int n = inputScanner.nextInt();
        inputScanner.close();

        int i, j, s;

        // Upper part of the diamond
        for (i = n; i >= 1; i--) {
            // Print leading stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in between
            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            // Print trailing stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower part of the diamond
        for (i = 1; i <= n; i++) {
            // Print leading stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in between
            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            // Print trailing stars
            for (j = 1; j <= i; j++) {  // Fix: Added closing parenthesis here
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}