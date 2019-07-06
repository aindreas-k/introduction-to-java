package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        final int NUMBER_LENGTH = 7;
        int initialNumber;
        int newNumber = 0;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Number: ");
            initialNumber = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        for (int i = 1; i <= NUMBER_LENGTH; i++) {

            int currentDigit = initialNumber % 10;
            initialNumber /= 10;

            for (int k = NUMBER_LENGTH - i; k > 0; k--) {
                currentDigit *= 10;
            }

            newNumber += currentDigit;
        }

        System.out.println("New number: " + newNumber);
    }
}