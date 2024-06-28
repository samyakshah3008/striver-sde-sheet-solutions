package logicBuildingQuestions;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        System.out.println("Hello there!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius");
        int radius = sc.nextInt();
        // write a program to calculate area of circle , area and perimeter of rectangle
        // and area of triangle

        double answer = calculateAreaOfCirlce(radius);
        System.out.println(answer);

        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();

        double answer2 = calculateAreaOfRectangle(length, breadth);
        System.out.println(answer2);

        double answer3 = calculatePerimeterOfRectangle(length, breadth);
        System.out.println(answer3);

        System.out.println("Please enter breadth for circle");
        int breadthCircle = sc.nextInt();
        System.out.println("Please enter height");
        int heightCircle = sc.nextInt();

        double answer4 = calculateAreaOfTriangle(breadthCircle, heightCircle);
        System.out.println(answer4);

    }

    public static double calculateAreaOfCirlce(double radius) {

        return 3.14 * radius * radius;
    }

    public static double calculateAreaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    public static double calculatePerimeterOfRectangle(int length, int breadth) {
        return 2 * length + 2 * breadth;
    }

    public static double calculateAreaOfTriangle(int breadth, int height) {
        return 0.5 * breadth * height;
    }

}
