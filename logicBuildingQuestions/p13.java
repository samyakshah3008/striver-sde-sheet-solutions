package logicBuildingQuestions;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant");
                } else {
                    System.out.println(ch + " is not a valid letter");
                }
                break;
        }
    }
}
