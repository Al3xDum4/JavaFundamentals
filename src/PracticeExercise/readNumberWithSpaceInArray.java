package PracticeExercise;

import java.util.Scanner;

public class readNumberWithSpaceInArray {
    public static void main (String args[])
    {
        Scanner chopper = new Scanner(System.in);
        System.out.println("Enter a list of number: ");

        int[] numCount = new int[10];
        int number;

        while (chopper.hasNextInt()) {
            number = chopper.nextInt();
            numCount[number]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + numCount[i]);
        }
    }
}
