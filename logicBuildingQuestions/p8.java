package logicBuildingQuestions;

import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {
        System.out.println("Welcome");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = scanner.nextInt();

        System.out.println("Etner number 2");
        int b = scanner.nextInt();

        System.out.println("Enter number 3");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("a");
        } else if (b > a && b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }

}
