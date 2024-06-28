import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number which you want to reverse");
        int number = scanner.nextInt();
        // eg 1234
        int reversedNumber = reverse(number);

        System.out.println(reversedNumber);
        scanner.close();

    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed;
    }
}
