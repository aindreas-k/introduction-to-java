package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskFourNoArrays {
    public static void main(String[] args) {

        final int NUMBER_LENGHT = 4;
        int number;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Number: ");
            number = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        int digitFour = number % 10;
        number /= 10;

        int digitThree = number % 10;
        number /= 10;

        int digitTwo = number % 10;
        number /= 10;

        int digitOne = number;

        int differenceOneTwo = digitOne - digitTwo;
        int differenceTwoThree = digitTwo - digitThree;
        int differenceThreeFour = digitThree - digitFour;

        if ((differenceOneTwo == differenceTwoThree) && (differenceOneTwo == differenceThreeFour)) {
            if (differenceOneTwo > 0) {
                System.out.println("Descending sequence");
            } else {
                System.out.println("Ascending sequence");
            }
        } else {
            System.out.println("Not a sequence");
        }
    }
}