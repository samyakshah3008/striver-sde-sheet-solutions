package logicBuildingQuestions;

import java.util.Scanner;

public class p5 {

    public static class Menu {
        public static void menu() {
            System.out.println("Welcome to program, select option to perform task");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter farenhiegt value");
                    int farenhiegt = scanner.nextInt();
                    convertToCelcius(farenhiegt);
                }

                case 2 -> {
                    System.out.println("Enter celcius value");
                    int celcius = scanner.nextInt();
                    convertToFahrenheit(celcius);
                }

                case 0 -> {
                    System.out.println("Exited");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        Menu myMenu = new Menu();

        do {
            myMenu.menu();

        } while (true);
    }

    public static double convertToFahrenheit(int celcuis) {
        return (9.0 / 5) * celcuis + 32;

    }

    public static double convertToCelcius(int fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);

    }
}
