package day4_10_11.datetime.exercises;

import java.time.LocalDate;
import java.time.Month;

public class Exercise2 {
    //Write a Java program to get the number of days of the current month
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        Month lunaCorespunzatoareZileiDeAzi = astazi.getMonth();
        int numarulDeZile = lunaCorespunzatoareZileiDeAzi.length(false);
        System.out.println(astazi.getMonth().maxLength());
    }
}
