package PracticeExercise;

import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first nr is: ");
        int num1 = sc.nextInt();

        System.out.println("second nr is: ");
        int num2 = sc.nextInt();

        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
        System.out.println(num1+" % "+num2+" = "+(num1%num2));
    }
}
