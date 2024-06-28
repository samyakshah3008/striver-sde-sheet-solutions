package logicBuildingQuestions;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate the sum of the first N odd numbers
        int sum = N * N;

        // for even it will be N*(N+1)

        // Print the result
        System.out.println("The sum of the first " + N + " odd numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
