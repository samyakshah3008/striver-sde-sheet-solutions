package logicBuildingQuestions;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Prompt the user to enter the start of the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        // Prompt the user to enter the end of the range
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Validate the range
        if (start > end) {
            System.out.println("Invalid range. The start should be less than or equal to the end.");
            scanner.close();
            return;
        }

        System.out.println("Multiples of " + N + " from " + start + " to " + end + ":");

        // Find the first multiple of N within the range
        int firstMultiple = (start + N - 1) / N * N;

        // Print multiples of N within the range using a for loop
        for (int i = firstMultiple; i <= end; i += N) {
            System.out.print(i + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
