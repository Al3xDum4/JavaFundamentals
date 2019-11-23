package PracticeExercise;

import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first number is: ");
        int nr1 = sc.nextInt();

        System.out.print("second number is: ");
        int nr2=sc.nextInt();

        System.out.println(nr1+" * "+nr2+" = "+(nr1*nr2));
    }
}
