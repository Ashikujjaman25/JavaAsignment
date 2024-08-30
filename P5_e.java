 package JavaAsignment;

import java.util.Scanner;

public class P5_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        printPattern(n);
    }

    private static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            printLine(n, i);
        }
        for (int i = 2; i <= n; i++) {
            printLine(n, i);
        }
    }

    private static void printLine(int n, int value) {
        StringBuilder line = new StringBuilder();
        for (int j = n; j >= 1; j--) {
            line.append((j > value ? j : value) + " ");
        }
        for (int j = 2; j <= n; j++) {
            line.append((value < j ? j : value) + " ");
        }
        System.out.println(line.toString().trim());
    }
}
