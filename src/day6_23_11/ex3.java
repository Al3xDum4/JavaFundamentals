package day6_23_11;

public class ex3 {
    public static void main(String[] args) {
        int[] array;
        array = initArray(100);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Metoda initAray imi intoarce un array cu primele Limit numere divizibile cu 11
     * @param limit reprezinta care nr sa imi contna array-ul
     * @return un array cu primele 100 de nr divizibile cu 11
     */
    private static int[] initArray(int limit) {
        int[] array = new int[limit];
        int count = 0;
        for (int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
                array[count++] = i;
            }
        }
        return array;
    }
}