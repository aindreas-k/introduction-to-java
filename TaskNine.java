package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner scanner = null;

        int dragonYears;

        final int BORN_HEADS = 3;

        final int HEADS_BEFORE_200 = 3;

        final int HEADS_BETWEEN_200_AND_300 = 2;

        final int HEADS_AFTER_300 = 1;

        try {
        	
            scanner = new Scanner(System.in);

            System.out.print("Dragon's age: ");
            dragonYears = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        if (dragonYears <= 200) {
            System.out.println(BORN_HEADS + dragonYears * HEADS_BEFORE_200);
        } else if (dragonYears <= 300) {
            System.out.println(BORN_HEADS + 200 * HEADS_BEFORE_200 + (dragonYears - 200) * HEADS_BETWEEN_200_AND_300);
        } else
            System.out.println(BORN_HEADS + 200 * HEADS_BEFORE_200 + 100 * HEADS_BETWEEN_200_AND_300 + (dragonYears - 300)
                    * HEADS_AFTER_300);
    }
}


