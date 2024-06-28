package logicBuildingQuestions;

import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Calculate the sum from 1 to k using a for loop
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }

        // Print the result
        System.out.println("The sum of numbers from 1 to " + k + " is: " + sum);

    }
}
