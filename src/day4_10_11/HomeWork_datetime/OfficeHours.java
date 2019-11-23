package day4_10_11.HomeWork_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class OfficeHours {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        String[] input = new String[10];

        while(scan.nextInt() != 0) {
            input[counter] = scan.nextLine();
            counter++;
        }
        System.out.println(Arrays.toString(input));
    }
}