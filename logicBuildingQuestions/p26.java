package logicBuildingQuestions;

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int previous = 0;
        int current = 1;

        for (int count = 0; count <= 10; count++) {
            int temp = current;
            current = current + previous;
            previous = temp;
            System.out.println(current);
        }

        System.out.println(current);
    }
}
