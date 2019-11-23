package day2_03_11.HomeExercise;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int side, width;

        System.out.print("This program prints an asterisk square!");
        System.out.println();
        System.out.print("Enter a side length: ");
        side = input.nextInt();

        int height = side;

        if (side <= 20 && side > 0) {

            while (height >= 1) {
                width = 1;

                while (width <= side) {
                    System.out.print("* "); //There is an asterisk and a space here
                    width++;
                    while (height >= 2 && height <= side - 1 && width <= side - 1) {
                        System.out.print("  "); //There's two spaces here
                        width++;
                    }
                }

                --height;
                System.out.println();
            }
        } else {
            System.out.print("Out of bounds!");
        }
        System.out.println();
    }
}