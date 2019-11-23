package day2_03_11;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        /*
        read from keyboard
        check using if-else
        < 10
        [10-20]
        [20-30]
        > 30
         */

        int x;
        x = Integer.parseInt(ss);
        if (x < 10) {
            System.out.println("x<10");
        }else {
            System.out.println("x>10");
            if (x<=20) {
                System.out.println("x<20");
            }
            else{
                System.out.println("x>20");
            }if (x<=30) {
                System.out.println("x<30");
            }else {
                System.out.println("x>30");
            }
            }
        }

    }

