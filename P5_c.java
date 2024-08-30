 
package JavaAsignment;
 
import java.util.Scanner;

public class P5_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Generating the diamond pattern
        printDiamond(n);
    }

    // Method to print the diamond pattern
    public static void printDiamond(int n) {
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            printLine(n, i);
        }
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            printLine(n, i);
        }
    }

    // Method to print a single line of the diamond
    private static void printLine(int n, int i) {
        System.out.print(" ".repeat(n - i));            // Print leading spaces
        System.out.println("*".repeat(2 * i - 1));      // Print stars
    }
}
