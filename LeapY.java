 
package JavaAsignment;
 
 
import java.util.Scanner;

public class LeapY{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Output the result
        System.out.println(year + (isLeapYear ? " is a leap year." : " is not a leap year."));

        scanner.close();
    }
}

