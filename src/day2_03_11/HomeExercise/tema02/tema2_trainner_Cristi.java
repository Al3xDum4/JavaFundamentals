package day2_03_11.HomeExercise.tema02;

import java.util.Arrays;

public class tema2_trainner_Cristi {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    private static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[array.length - i - 1] = array[i];
        return newArray;
    }
}

