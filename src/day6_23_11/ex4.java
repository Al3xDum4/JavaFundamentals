package day6_23_11;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti textul:");
        String input = sc.nextLine();
        System.out.println("textul este: " + input);

        char[] litere = new char[input.length()];
        int[] count = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = 0; j <= i; j++) {
                if (litere[j] == input.charAt(i)) {
                    count[j]++;
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                for (int j = 0; j < litere.length; j++) {
                    if (litere[j] == 0) {
                        litere[j] = input.charAt(i);
                        count[j] = 1;
                        break;
                    }
                }
            }
        }
        printArray(litere);
        printArray(count);
    }

    private static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                break;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
