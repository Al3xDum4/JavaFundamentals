package day3_09_11.HomeExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class roundDouble {
    public static void main(String[] args) {

        System.out.print("double number is: ");
        Scanner sc = new Scanner(System.in);
        double x = 0;
        x = sc.nextInt();
        System.out.println(new DecimalFormat("0.00").format(x));
    }
}
