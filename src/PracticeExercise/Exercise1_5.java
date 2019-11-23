package PracticeExercise;

import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numarul dv este: ");
        int nr = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(nr + " x " + (i + 1) + " = " + (nr * (i + 1)));
        }
    }
}
