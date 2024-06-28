package logicBuildingQuestions;

import java.util.Scanner;

public class p6 {

    public class SwapWithoutTemp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Print original values
            System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

            // Swap the numbers without using a temporary variable
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            // Print swapped values
            System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

            // Close the scanner
            scanner.close();
        }
    }

}
