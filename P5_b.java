 package JavaAsignment;

import java.util.Scanner;

public class P5_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        printPattern(scanner.nextInt());
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i)); // Print spaces and stars in one line
        }
    }
}
