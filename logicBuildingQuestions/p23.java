package logicBuildingQuestions;

import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate the sum of the series
        double sum = 0;
        int numerator = 1;
        int denominator = 1;

        for (int i = 1; i <= N; i++) {
            sum += (double) numerator / denominator;
            numerator += 2;
            if (i == 1) {
                denominator += 4;
            } else {
                denominator += 2;
            }
        }

        // Print the result
        System.out.println("The sum of the series for first " + N + " terms is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
