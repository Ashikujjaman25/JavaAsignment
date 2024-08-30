 
package JavaAsignment;
 
import java.util.Scanner;

public class  P5_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Generating the pattern
        generatePattern(n);

        scanner.close();
    }

    // Method to generate the pattern
    public static void generatePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
