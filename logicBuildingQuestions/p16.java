package logicBuildingQuestions;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        // WAP to display multiplication table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of which table do you want");

        int number = sc.nextInt();

        System.out.println("Enter upto which iteration count you want");
        int iterationCount = sc.nextInt();

        for (int i = 1; i <= iterationCount; i++) {
            int answer = number * i;
            System.out.println(answer);
        }

    }
}
