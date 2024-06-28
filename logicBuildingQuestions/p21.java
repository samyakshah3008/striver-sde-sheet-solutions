package logicBuildingQuestions;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize counters
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");

        // Read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        // Close the scanner
        scanner.close();
    }

}
