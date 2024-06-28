package logicBuildingQuestions;

import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the percentage
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        // Determine the grade based on the percentage range
        int range = (int) percentage / 10; // Divide percentage by 10 to get range

        char grade;
        switch (range) {
            case 10:
            case 9:
            case 8:
            case 7:
                grade = 'A';
                break;
            case 6:
                grade = 'B';
                break;
            case 5:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }

        // Print the grade
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
