package day4_10_11.datetime.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {
    //Write a Java program to get day-in-week name for now date.

    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        DayOfWeek dayOfWeek = astazi.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

}
