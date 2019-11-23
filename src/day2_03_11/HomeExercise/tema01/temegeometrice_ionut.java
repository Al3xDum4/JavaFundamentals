package day2_03_11.HomeExercise.tema01;

import java.util.Scanner;

public class temegeometrice_ionut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            menuPrompt();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n Latura patratului: ");
                    double lP = input.nextDouble();
                    double aP = lP * lP;
                    System.out.printf("\n Aria patratului: %4.2f", aP);
                    double pP = 4 * lP;
                    System.out.printf("\n Perimetrul patratului: %4.2f", pP);
                    break;
                case 2:
                    System.out.printf("\n Introdu raza: ");
                    double rC = input.nextDouble();
                    double aC = Math.PI * (rC * rC);
                    System.out.printf("\n Aria cercului: " + aC);
                    double cCC = Math.PI * 2 * rC;
                    System.out.printf("\n Circumferinta cercului: " + cCC);
                    break;
                case 3:
                    double a, b, c, pT, s, aT;
                    System.out.println("\n Introdu 3 laturi ale triunghiului: ");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    c = input.nextDouble();
                    pT = a + b + c;
                    s = (a + b + c) / 2;
                    aT = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.printf("\n Perimetrul triunghiului: %.2f\n", pT);
                    System.out.printf("\n Semi perimetrul triunghiului: %.2f\n", s);
                    System.out.printf("\n Aria triunghiului: %.2f\n", aT);
                    break;
                case 0:
                    System.out.println("0. Cya");
                    break;
                default:
                    System.out.println("Selecteaza una dintre cele 3 forme geometrice: \n Patrat, Cerc sau Triunghi ");
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void menuPrompt() {
        System.out.println("Geometry Menu: ");
        System.out.println("1. Patrat ");
        System.out.println("2. Cerc ");
        System.out.println("3. Triunghi");
        System.out.println("0. Exit ");
        System.out.println("Your choice ");
    }
}

