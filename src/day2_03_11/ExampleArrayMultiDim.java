package day2_03_11;

public class ExampleArrayMultiDim {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            for (int j : a[i]) {
                System.out.println(j);
            }
        }
    }
}
