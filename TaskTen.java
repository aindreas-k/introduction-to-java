package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {

        Scanner scanner = null;

        char input;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Enter a letter: ");
            input = scanner.next().charAt(0);
            input = Character.toLowerCase(input);

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        checkForVowelsOne(input);
        checkForVowelsTwo(input);
        checkForVowelsThree(input);
        checkForVowelsFour(input);
    }


    public static void checkForVowelsOne(char letter) {
        switch (letter) {

            case 'a':
                System.out.println("Vowel");
                break;

            case 'e':
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a vowel");
        }

    }

    public static void checkForVowelsTwo(char letter) {

        String vowels = "aeiou";
        if (vowels.indexOf(letter) >= 0) {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }

    public static void checkForVowelsThree(char letter) {

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }

    public static void checkForVowelsFour(char letter) {
        char[] array = {'a', 'e', 'i', 'o', 'u'};

        for (char currentChar : array) {
            if (currentChar == letter) {
                System.out.println("Vowel");
                return;                             //return in loops is bad
            }
        }
        System.out.println("Not a vowel");
    }

}


