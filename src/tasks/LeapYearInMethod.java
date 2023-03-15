package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year ");
        int year = scanner.nextInt();

        determinLeapYear(year);
        System.out.println(determinLeapYearString(year));
    }

    public static void determinLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
    public static String determinLeapYearString(int year){
        String answer;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            answer = "Leap year";
        } else {
            answer = "Not a leap year";
        }
        return answer;
    }
}
