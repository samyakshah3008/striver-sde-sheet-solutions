package logicBuildingQuestions;

import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0 -> System.out.println("Number is even");
            case 1 -> System.out.println("Odd");
            case -1 -> System.out.println("odd");
        }

        // Close the scanner
        scanner.close();
    }

}
