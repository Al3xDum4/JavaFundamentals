package day7_24_11;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Punct1();
    }

    public static void Punct1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = new int[dim];
        int sum = 0;
        for (int i = 0; i < dim; i++) {
            System.out.print("array[" + (i + 1) + "]=");
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Suma elementelor din array: " + sum);
    }
}
