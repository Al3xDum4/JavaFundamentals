package day4_10_11.datetime.exercises;

import java.time.LocalDate;

public class Exercise5 {
    //    Write a Java program to get the months remaining in the year.
    public static void main(String[] args) {
        LocalDate azi = LocalDate.now();
        int totalLuni = 12;
        int luniRamase = totalLuni - azi.getMonthValue();

        System.out.println(luniRamase);
    }
}
