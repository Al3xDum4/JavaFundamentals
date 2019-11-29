package PracticeExercise;

import java.util.Scanner;

public class DrawReverseTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.print("Dimensiune array: ");
        //int dim = sc.nextInt();
        //int[] array = new int[dim];
        //for (int i = 0; i < dim; i++) {
        // System.out.print("array[" + (i + 1) + "]= ");
        //array[i] = sc.nextInt();

        System.out.print("Dimensiunea laturii este: ");
        int dimLatura = sc.nextInt();

        for (int i = dimLatura; i > 0; i--) {
            for (int j = dimLatura; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
