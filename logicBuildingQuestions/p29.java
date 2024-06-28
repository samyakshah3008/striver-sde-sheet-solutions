package logicBuildingQuestions;

import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower bound of the range");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter the upper bound of the range");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers in the range [" + lowerBound + ", " + upperBound + "]:");

        for (int number = lowerBound; number <= upperBound; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number + "");
            }
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = 0;

        while (originalNumber != 0) {
            numberOfDigits++;
            originalNumber /= 10;
        }

        double sum = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            double digit = originalNumber % 10;
            sum = sum + Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        return sum == number;

    }
}
