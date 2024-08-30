
package JavaAsignment;
 
import java.util.Scanner;
public class Prim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Assume the number is prime until proven otherwise
        boolean isPrime = number > 1;

        // Check divisibility
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Output the result
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));

        scanner.close();
    }
}