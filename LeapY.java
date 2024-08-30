 package JavaAsignment;

import java.util.Scanner;

public class LeapY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input and check leap year in one step
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(year + ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? " is a leap year." : " is not a leap year."));

        scanner.close();
    }
}
