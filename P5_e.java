package JavaAsignment;
 
import java.util.Scanner;

public class P5_e{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        printPattern(number);
    }

    private static void printPattern(int number) {
        // Print the upper part of the pattern
        for (int i = number; i >= 1; i--) {
            printLine(number, i);
        }

        // Print the lower part of the pattern
        for (int i = 2; i <= number; i++) {
            printLine(number, i);
        }
    }

    private static void printLine(int number, int value) {
        for (int j = number; j >= 1; j--) {
            System.out.print((j > value ? j : value) + " ");
        }
        for (int j = 2; j <= number; j++) {
            System.out.print((value < j ? j : value) + " ");
        }
        System.out.println();
    }
}