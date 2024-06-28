package logicBuildingQuestions;

import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find sum of first and last digits: ");
        int number = scanner.nextInt();

        // Calculate sum of first and last digits
        int sum = sumOfFirstLastDigits(number);

        // Print the sum of first and last digits
        System.out.println("Sum of first and last digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    public static int sumOfFirstLastDigits(int number) {
        // Find the last digit
        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Calculate and return the sum of first and last digits
        return firstDigit + lastDigit;
    }
}
