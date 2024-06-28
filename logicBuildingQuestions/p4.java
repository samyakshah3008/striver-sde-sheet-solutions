package logicBuildingQuestions;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Convert days to months and remaining days
        int months = totalDays / 30;
        int days = totalDays % 30;

        // Display the results
        System.out.println(totalDays + " days is equivalent to " + months + " months and " + days + " days.");

        // Close the scanner
        scanner.close();
    }
}
