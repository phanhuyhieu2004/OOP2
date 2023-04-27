package bai3;

import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạch của tam giác:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        try {
            checkTriangle(side1, side2, side3);
            System.out.println("Đây là những cạnh hợp lệ cho một tam giác.\n");
        } catch (IllegalTriangleException e) {
            System.out.println("These are not valid sides for a triangle.");
        }
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Side(s) cannot be negative or zero.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Sum of two sides must be greater than the third side.");
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

