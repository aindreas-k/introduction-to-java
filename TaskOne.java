package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("a: ");
            a = scanner.nextInt();

            System.out.print("b: ");
            b = scanner.nextInt();

            System.out.print("c: ");
            c = scanner.nextInt();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        if (a == b && b == c) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
}
