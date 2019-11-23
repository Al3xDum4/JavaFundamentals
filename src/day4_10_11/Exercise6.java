package day4_10_11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;

public class Exercise6 {
    //Write a Java program to get the months remaining in the year.
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        int totalLuni = 12;
        int luniRamase = totalLuni - astazi.getMonthValue();

        System.out.println(luniRamase);
    }
}
