package logicBuildingQuestions;

import java.util.Scanner;

public class p35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double average = 0.0;

        // Read 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // Calculate sum
            sum += number;

            // Find maximum number
            if (number > max) {
                max = number;
            }

            // Find minimum number
            if (number < min) {
                min = number;
            }
        }

        // Calculate average
        average = (double) sum / 10;

        // Print results
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Average of the numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}
