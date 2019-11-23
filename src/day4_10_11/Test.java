package day4_10_11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");
    System.out.println("Dati data: ");
    String input = in.nextLine();
    LocalDateTime form = LocalDateTime.parse(input,formatter);
    System.out.println(form);
    System.out.println(form.getHour());
    System.out.println("Ziua saptamanii: " +form.getDayOfWeek().getValue());
    System.out.println("Ziua saptamanii: " +form.getDayOfWeek());}
}
