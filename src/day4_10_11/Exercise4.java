package day4_10_11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

public class Exercise4 {
    //Write a Java program to get the dates 10 days before and after today
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;

        acumZeceZile = astazi.minus(10, DAYS);
        dupaZeceZile = astazi.plus(10, DAYS);

        acumZeceZile = acumZeceZile.minusDays(10);
        dupaZeceZile = dupaZeceZile.plusDays(10);

        LocalDate countMinusDays = acumZeceZile;
        LocalDate countPlusDays = dupaZeceZile;

        System.out.println(astazi);
        System.out.println(countMinusDays);
        System.out.println(countPlusDays);
    }
}
