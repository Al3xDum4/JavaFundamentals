package PracticeExercise;

import java.util.Scanner;

public class sequnceOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dati numerele: ");
        String sampleString = sc.nextLine();
        String[] stringArrays = sampleString.split("\\s+");
        int[] intArrays = new int[stringArrays.length];
        for (int i = 0; i < stringArrays.length; i++) {
            String numberAsString = stringArrays[i];
            intArrays[i]=Integer.parseInt(numberAsString);
            System.out.println(intArrays[i]);
        }

    }
}
