package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("First number: ");
            firstNumber = scanner.nextInt();

            System.out.print("Second number: ");
            secondNumber = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        firstNumber = firstNumber + secondNumber;

        secondNumber = firstNumber - secondNumber;

        firstNumber = firstNumber - secondNumber;

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}