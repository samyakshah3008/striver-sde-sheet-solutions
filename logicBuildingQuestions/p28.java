package logicBuildingQuestions;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate sum of digits: ");
        int number = scanner.nextInt();

        // Calculate sum of digits
        int sum = sumOfDigits(number);

        // Print the sum of digits
        System.out.println("Sum of digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();

    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        return sum;
    }
}
