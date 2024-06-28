package logicBuildingQuestions;

import java.util.Scanner;

public class p11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number from 1 to 7
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week using a switch statement
        switch (dayNumber) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 7.");
        }

        // Close the scanner
        scanner.close();
    }
}
