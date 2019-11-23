package day2_03_11;

import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        /**
         * read for keyboard CNP
         * verify first digit and print
         * Male/Female
         *
         * 1digit of cnp :
         * 1,3,5 Male
         * 2,4,6 Female
         */

        switch (ss.charAt(0)) {
            case '1':
            case '5':
            case '3':
                System.out.println("Male");
                break;
            case '4':
            case '6':
            case '2':
                System.out.println("Female");
                break;
            default:
                System.out.println("Undefined");
        }

    }
}
