package logicBuildingQuestions;

import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate the sum of the series
        double sum = 0.0;

        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }

        // Print the result
        System.out.println("The sum of the series for first " + N + " terms is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
