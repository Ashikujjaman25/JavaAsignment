 package JavaAsignment;

import java.util.Scanner;

public class P5_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        generatePattern(scanner.nextInt());
        scanner.close();
    }

    public static void generatePattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("* ".repeat(i)); // Print '*' i times
        }
    }
}
