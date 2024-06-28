package logicBuildingQuestions;

import java.util.Scanner;

public class p36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array of 10 integers
        int[] numbers = new int[10];

        // Input data into the array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum of even numbers and find maximum number
        int sumOfEven = 0;
        int max = numbers[0]; // Initialize max with the first element

        for (int number : numbers) {
            if (number % 2 == 0) { // Check if number is even
                sumOfEven += number; // Add even number to sum

                if (number > max) { // Update max if current number is greater
                    max = number;
                }
            }
        }

        // Print results
        System.out.println("\nSum of even numbers: " + sumOfEven);
        System.out.println("Maximum number among even numbers: " + max);

        // Close the scanner
        scanner.close();
    }
}
