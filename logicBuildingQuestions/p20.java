package logicBuildingQuestions;

public class p20 {

    public static void main(String[] args) {
        int sum = 0;

        // Loop through integers greater than 100 and less than 200
        for (int i = 101; i < 200; i++) {
            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                sum += i;
            }
        }

        // Print the result
        System.out.println(
                "The sum of all integers greater than 100 and less than 200 that are divisible by 5 is: " + sum);

    }

}
