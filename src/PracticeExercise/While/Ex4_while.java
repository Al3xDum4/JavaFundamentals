package PracticeExercise.While;

import java.util.Scanner;

public class Ex4_while {
    public static void main(String[] args) {
        int i = 0;
        String x = "";
        while (i == 0) {
            System.out.print("simple ");
            Scanner opt = new Scanner(System.in);
            x = opt.nextLine();
            i++;
        }
        System.out.println("simple "+x);
    }
}