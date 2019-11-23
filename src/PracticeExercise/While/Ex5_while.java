package PracticeExercise.While;

import java.util.Scanner;

public class Ex5_while {
    public static void main(String[] args) {
        int i = 0;
        String x = "";
        StringBuilder xy = new StringBuilder();
        while (i == 0) {
            Scanner opt = new Scanner(System.in);
            x = opt.nextLine();
            xy.append(x);
            i++;
        }
        xy = xy.reverse();
        System.out.println(xy);
    }
}
