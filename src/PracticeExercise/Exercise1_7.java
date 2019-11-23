package PracticeExercise;

import java.util.Scanner;

public class Exercise1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nr1 este: ");
        int x = sc.nextInt();
        System.out.print("nr2 este: ");
        int y = sc.nextInt();
        System.out.print("nr3 este: ");
        int z = sc.nextInt();

        System.out.println("Average is: "+ ((x+y+z)/3));
    }
}
