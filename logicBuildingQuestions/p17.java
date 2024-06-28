package logicBuildingQuestions;

public class p17 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        // int sum = 0;
        // int i = 1;

        // while (i <= 100) {
        // sum += i;
        // i++;
        // }

        // do {
        // sum += i;
        // i++;
        // } while (i <= 100);

        System.out.println("The sum of numbers from 1 to 100 using for loop is: " + sum);
    }
}
