package PracticeExercise;

import java.util.Scanner;

public class Exercise1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr1;
        int nr2;

        System.out.println("primul numar este: ");
        nr1 = sc.nextInt();
        System.out.println("al doilea numar este: ");
        nr2 = sc.nextInt();

        if (nr1 == nr2) {
            System.out.printf("%d == %d\n", nr1, nr2);
        }
        if (nr1 > nr2) {
            System.out.printf("%d > %d\n", nr1, nr2);
        }
        if(nr1<nr2){
            System.out.printf("%d < %d\n",nr1,nr2);
        }
        if(nr1!=nr2) {
            System.out.printf("%d != %d\n",nr1,nr2);
        }
        if(nr1>=nr2){
            System.out.printf("%d >= %d\n",nr1,nr2);
        }
        if(nr1<=nr2){
            System.out.printf("%d <= %d\n",nr1,nr2);
        }
    }
}
