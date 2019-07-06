package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        Scanner scanner = null;

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        try {

            scanner = new Scanner(System.in);

            System.out.println("Enter dots coordinates: ");

            System.out.print("A: x1 = ");
            x1 = scanner.nextInt();

            System.out.print("A: y1 = ");
            y1 = scanner.nextInt();

            System.out.print("B: x2 = ");
            x2 = scanner.nextInt();

            System.out.print("B: y2 = ");
            y2 = scanner.nextInt();

            System.out.print("C: x3 = ");
            x3 = scanner.nextInt();

            System.out.print("C: y3 = ");
            y3 = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        //check, if the dots lie on the same line, if so, no triangle is possible

        if ((y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1)) {
            System.out.println("No triangle");
        } else {
            System.out.println("Triangle");

            //a^2 + b^2 = c^2
            
            int sideOneSquare = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            int sideTwoSquare = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
            int sideThreeSquare = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);

            if ((sideOneSquare == sideTwoSquare + sideThreeSquare) || (sideTwoSquare == sideOneSquare + sideThreeSquare) ||
                    (sideThreeSquare == sideOneSquare + sideTwoSquare)) {
                System.out.println("A right triangle");
            } else {
                System.out.println("Not a right triangle");
            }
        }

    }
}


