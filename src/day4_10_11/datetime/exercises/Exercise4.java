package day4_10_11.datetime.exercises;

import java.time.LocalDateTime;

public class Exercise4 {
    //Write a Java program to get a date and time after 2 weeks and 10 minutes.
    public static void main(String[] args) {
        LocalDateTime astaziAcum = LocalDateTime.now();
        LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes(10);

        System.out.println(raspuns);
    }
}
