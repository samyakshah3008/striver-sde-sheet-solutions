package logicBuildingQuestions;

import java.util.Scanner;

public class p37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of size 'size'
        int[] numbers = new int[size];

        // Input data into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to track largest odd and even numbers
        int largestOdd = Integer.MIN_VALUE;
        int largestEven = Integer.MIN_VALUE;

        // Iterate through the array to find largest odd and even numbers
        for (int number : numbers) {
            if (number % 2 != 0) { // Check if number is odd
                if (number > largestOdd) {
                    largestOdd = number;
                }
            } else { // Number is even
                if (number > largestEven) {
                    largestEven = number;
                }
            }
        }

        // Print results
        if (largestOdd != Integer.MIN_VALUE) {
            System.out.println("Largest odd number: " + largestOdd);
        } else {
            System.out.println("No odd numbers found.");
        }

        if (largestEven != Integer.MIN_VALUE) {
            System.out.println("Largest even number: " + largestEven);
        } else {
            System.out.println("No even numbers found.");
        }

        // Close the scanner
        scanner.close();
    }
}
