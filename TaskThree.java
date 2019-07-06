package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        double r1;
        double r2;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("R1: ");
            r1 = scanner.nextDouble();

            System.out.print("R2: ");
            r2 = scanner.nextDouble();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        double circleOneSquare = 3.14 * r1 * r1;
        double circleTwoSquare = 3.14 * r2 * r2;

        double ringSquare = circleOneSquare - circleTwoSquare;

        System.out.println("Ring square: " + ringSquare);
    }
}