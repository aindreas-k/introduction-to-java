package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        double dinoKilograms;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Kilograms: ");
            dinoKilograms = scanner.nextDouble();


        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        double dinoMilligrams = dinoKilograms * 1000 * 1000;

        double dinoGrams = dinoKilograms * 1000;

        double dinoTons = dinoKilograms / 1000;

        System.out.println("Milligrams: " + dinoMilligrams);
        System.out.println("Grams: " + dinoGrams);
        System.out.println("Tons: " + dinoTons);
    }
}
