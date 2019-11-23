package day4_10_11.datetime.exercises;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise6 {
    //Write a Java program to show the date after reading years,
    // months and days from console
    public static void main(String[] args) {
        System.out.println("Year: ");
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();

        System.out.println("Month: ");
        String month = in.nextLine();

        System.out.println("Day: ");
        String day = in.nextLine();

        int yearInIntFormat = Integer.parseInt(year);
        int monthInIntFormat = Integer.parseInt(month);
        int dayInIntFormat = Integer.parseInt(day);

        LocalDate aDate = LocalDate.of(yearInIntFormat, monthInIntFormat, dayInIntFormat);

        System.out.println(aDate);
    }
}
