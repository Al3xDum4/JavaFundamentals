package day2_03_11;

import java.util.Scanner;

public class if_else_var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);
        int x = Integer.parseInt(ss);
        if ( x < 10) {
            System.out.println("x < 10");
        }
        else
        {
            if (10 > x && x < 20)
            {
                System.out.println("10 > x < 20");
            }
            else
            {
                if (20 > x && x < 30)
                {
                    System.out.println("20 > x < 30");
                }
                else
                {
                    System.out.println("x > 30");
                }
            }
        }


    }
}
