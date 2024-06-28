package logicBuildingQuestions;

import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Prompt the user to enter another number for finding primes up to that number
        System.out.print("Enter a number to find all prime numbers up to that number: ");
        int n = scanner.nextInt();

        // Find and print all prime numbers up to n
        System.out.println("Prime numbers up to " + n + ":");
        findAndPrintPrimes(n);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check for factors from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        return true; // No factors found, prime
    }

    // Method to find and print all prime numbers up to a given number n
    public static void findAndPrintPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing primes
    }
}
