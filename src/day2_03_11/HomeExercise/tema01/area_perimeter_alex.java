package day2_03_11.HomeExercise.tema01;

/*
Program to calculate the area and perimeter of a given figure.
1. Display the following in the console:

    1. Patrat
    2. Cerc
    3. Triunghi echilateral
    4. Exit

    Option:_

2. Read the option from the console and store the value in a variable.
3. Using a do while loop display and read the option until the option is 4.
4. If the user inputs an option value other than 4: display and read the defining parameter for each figure.
    Read the in case needed values:
        a. for Patrat read latura
        b. for Cerc read raza
        c. for triunghi read latura
5. Create 2 methods
        a. public Double area(String figure, Double paramater)
        b. public Double perimeter(String figure, Double paramater)
    In the methods above the figure is the type of figure (cerc,patrat,triunghi) and parameter is the in case needed parameter.
    Ex cerc neede raza, patrat needes latura and triughi needs latura in order to calculate the area and perimeter.
6. Using the 2 methids from point 5 display the values to the user.    Please format the value using printf: only display 2 decimals.
 */

import java.util.Scanner;

public class area_perimeter_alex {
    public static void main(String[] args) {

        System.out.println("Meniu:");
        System.out.println("1. Patrat");
        System.out.println("2. Cerc");
        System.out.println("3. Triunghi echilateral");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Option:_");

        Scanner sc = new Scanner(System.in);
        int i = 0;
        i = sc.nextInt();

        System.out.println();
        System.out.print("Optiunea aleasa este: " + i);
        System.out.println();
        System.out.println();

        do {
            System.out.print("Option:_");
            Scanner opt = new Scanner(System.in);
            i = opt.nextInt();
            i++;
        } while (i <= 4);
        System.out.println("EXIT");

        System.out.println();
        System.out.print("Option:_");
        int j;
        Scanner opt = new Scanner(System.in);
        j = opt.nextInt();
        System.out.println();

        if (j != 4 && j == 1) {
            System.out.print("latura patratului este:_");
            Scanner lat = new Scanner(System.in);
            j = lat.nextInt();
        } else if (j != 4 && j == 2) {
            System.out.print("raza cercului este:_");
            Scanner raz = new Scanner(System.in);
            j = raz.nextInt();
        } else if (j != 4 && j == 3) {
            System.out.print("latura triungiului este:_");
            Scanner latt = new Scanner(System.in);
            j = latt.nextInt();
        } else System.out.println("EXIT");
    }

    /*public static Double area(String figura, double latura) {
        if (figura.equals("patrat")) {
            return (latura * latura);
        } else if (figura.equals("cerc")) {
            return (3.14 * latura * latura);
        } else if (figura.equals("triunghi")) {
            return (latura * latura * Math.sqrt(3) / 4);
        } else System.out.println("Exit");
    }*/
}




