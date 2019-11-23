package day6_23_11;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("primul numar pozitiv: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("al doilea numar pozitiv: ");
        int m = Integer.parseInt(sc.nextLine());

        while (n < 0 || m < 0) {
            System.out.println("citeste inca odata primul numar: ");
            n = Integer.parseInt(sc.nextLine());

            System.out.println("citeste inca odata al doilea numar: ");
            m = Integer.parseInt(sc.nextLine());
        }
        System.out.println("numerle sunt: " + m + " " + n);
        if (m < n) {
            System.out.println("al doilea numar trebuie sa fie mai mare ca primul");
        }
        numere(n, m);
    }

    private static void numere(int n, int m) {
        long x = System.currentTimeMillis();
        for (int i = 1; i <= m; i = i + n) {
            System.out.println(i);
            if (System.currentTimeMillis() - x > 10000) {
                break;
            }
        }
    }
}
