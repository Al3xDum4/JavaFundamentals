package PracticeExercise;

import java.util.Scanner;

public class sequnceOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dati numerele: ");
        String sirNumere = sc.nextLine();
        String[] sirArrays = sirNumere.split(" ");
        int[] arrays = new int[sirArrays.length];
        for (int i = 0; i < sirArrays.length; i++) {
            String x = sirArrays[i];
            arrays[i] = Integer.parseInt(x);
            System.out.println("index[" + i + "]= " + arrays[i]);
        }
        int sum = 0;
        int prod = 1;
        for (int i : arrays) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("suma este: " + sum);
        System.out.println("produsul este: " + prod);
    }
    /*
    System.out.println("Enter the elements seperated by spaces: ");
    String input = sc.nextLine();
    String[] split = input.split("\\s+");
    int[] desiredOP = new int[split.length];
    int i=0;
    for (String string : split) {
    desiredOP[i++] = Integer.parseInt(string);
    }

     */
}

