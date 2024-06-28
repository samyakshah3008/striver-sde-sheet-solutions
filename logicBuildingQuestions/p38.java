package logicBuildingQuestions;

import java.util.Scanner;

public class p38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array of integers of given size
        int[] numbers = new int[size];

        // Input data into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print array elements in reverse order
        System.out.println("\nArray elements in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
