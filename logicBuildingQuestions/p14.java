package logicBuildingQuestions;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many iterations of hello you want");
        int iterationCount = scanner.nextInt();

        for (int i = 1; i <= iterationCount; i++) {
            System.out.println("Hello");
        }
    }
}
