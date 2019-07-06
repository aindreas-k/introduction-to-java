package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskFiveNoArrays {
    public static void main(String[] args) {

        final int NUMBER_LENGTH = 6;
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

        System.out.println("Arithmetic mean: " + arithmeticMean(number, NUMBER_LENGTH));
        System.out.println("Geometric mean: " + geometricMean(number, NUMBER_LENGTH));
    }

    public static double arithmeticMean(int number, int length) {
        int sum = 0;

        for (int currentNumber = number; currentNumber >= 1; currentNumber /= 10) {
            sum += currentNumber % 10;
        }

        return (double) sum / length;
    }

    public static double geometricMean(int number, int length) {
        int product = 1;

        for (int currentNumber = number; currentNumber >= 1; currentNumber /= 10) {
            product *= currentNumber % 10;
        }

        return Math.pow(product, (double) 1 / length);
    }
}