package day7_24_11;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        Punct1(first);
        Punct2(first);
    }

    public static void Punct1(Scanner scan) {
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(dim);
        System.out.println("Suma elementelor din array: " + sumArray(array));
    }

    public static void Punct2(Scanner scan) {
        //Write a Java program to calculate the average value of array elements
        System.out.println("Citeste dimensiunea: ");
        int dim = scan.nextInt();
        int[]array=readArray(dim);
        double average = (double) sumArray(array)/dim;
        System.out.println("Media elementelor din array este: " +average);


    }

    public static int[] readArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + (i + 1) + "]=");
            array[i] = scan.nextInt();

        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
