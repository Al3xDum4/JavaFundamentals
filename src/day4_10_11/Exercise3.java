package day4_10_11;

import java.time.LocalDate;
import java.time.Month;

public class Exercise3 {
    //Write a Java program to get the number of days of current month
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        Month lunaCorespunzatoareZileiDeAzi = astazi.getMonth();
        int numarDeZile = lunaCorespunzatoareZileiDeAzi.maxLength();
        System.out.println(numarDeZile);
        System.out.println(astazi.getMonthValue());
    }
}
