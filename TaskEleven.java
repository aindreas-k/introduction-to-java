package by.etc.introduction_to_java.main;

import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {

        Scanner scanner = null;

        int dayInput;
        int monthInput;
        int yearInput;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Day: ");
            dayInput = scanner.nextInt();

            System.out.print("Month: ");
            monthInput = scanner.nextInt();

            System.out.print("Year: ");
            yearInput = scanner.nextInt();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        if (!checkIfTheDateIsValid(dayInput, monthInput, yearInput)) {
            System.out.println("Wrong date!");
            return;
        }

        System.out.println(checkNextDayDate(dayInput, monthInput, yearInput));
    }

    public static boolean checkLeapYear(int year) {
        boolean returnFlag = false;

        if (year % 4 == 0) {
            returnFlag = true;
        }

        if (year % 4 == 0 && year % 100 == 0) {
            returnFlag = false;
        }

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            returnFlag = true;
        }

        return returnFlag;
    }

    public static boolean checkIfTheDateIsValid(int currentDay, int currentMonthNumber, int currentYear) {

        if (currentDay > 31) {
            return false;
        }

        if (currentMonthNumber > 12) {
            return false;
        }

        if (currentDay <= 0 || currentMonthNumber <= 0 || currentYear <= 0) {
            return false;
        }

        if (currentDay == 29 && currentMonthNumber == 2) {
            if (!checkLeapYear(currentYear)) {
                return false;
            }
        }

        if (currentDay == 30 && currentMonthNumber == 2) {
            return false;
        }

        if (currentDay == 31) {
            if (currentMonthNumber == 2 || currentMonthNumber == 4 || currentMonthNumber == 6 || currentMonthNumber == 9 ||
                    currentMonthNumber == 11) {
                return false;
            }
        }

        return true;
    }

    public static String checkNextDayDate(int currentDay, int currentMonthNumber, int currentYear) {
        String dateToReturn = "Next day is ";

        int nextDayNumber;
        int nextDayMonthNumber;
        int nextDayYear;

        if (currentDay == 31 && currentMonthNumber == 12) {
            nextDayYear = currentYear + 1;
            nextDayMonthNumber = 1;
            nextDayNumber = 1;
            return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
        }

        if (currentDay == 31) {
            if (currentMonthNumber == 1 || currentMonthNumber == 3 || currentMonthNumber == 5 ||
                    currentMonthNumber == 6 || currentMonthNumber == 8 || currentMonthNumber == 10) {
                nextDayNumber = 1;
                nextDayMonthNumber = currentMonthNumber + 1;
                nextDayYear = currentYear;
                return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
            }
        } else if (currentDay == 30) {
            if (currentMonthNumber == 4 || currentMonthNumber == 6 || currentMonthNumber == 9 || currentMonthNumber == 11) {
                nextDayNumber = 1;
                nextDayMonthNumber = currentMonthNumber + 1;
                nextDayYear = currentYear;
                return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
            }
        } else if (currentDay == 28) {
            if (currentMonthNumber == 2) {
                if (checkLeapYear(currentYear)) {
                    nextDayNumber = 29;
                    nextDayMonthNumber = currentMonthNumber;
                    nextDayYear = currentYear;
                    return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
                } else {
                    nextDayNumber = 1;
                    nextDayMonthNumber = currentMonthNumber + 1;
                    nextDayYear = currentYear;
                    return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
                }
            }
        } else if (currentDay == 29 && currentMonthNumber == 2 && checkLeapYear(currentYear)) {
            nextDayNumber = 1;
            nextDayMonthNumber = currentMonthNumber + 1;
            nextDayYear = currentYear;
            return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
        }

        nextDayNumber = currentDay + 1;
        nextDayMonthNumber = currentMonthNumber;
        nextDayYear = currentYear;

        return dateToReturn + nextDayNumber + "." + nextDayMonthNumber + "." + nextDayYear;
    }

}


