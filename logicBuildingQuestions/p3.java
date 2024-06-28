package logicBuildingQuestions;

import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks for three subjects
        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate total marks
        double total = subject1 + subject2 + subject3;

        // Calculate percentage
        double percentage = (total / 300) * 100;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Marks for Subject 1: " + subject1);
        System.out.println("Marks for Subject 2: " + subject2);
        System.out.println("Marks for Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        // Close the scanner
        scanner.close();
    }

}
