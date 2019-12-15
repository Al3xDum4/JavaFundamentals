package day10_14_12.algorithms.and.data.structures;

/**
 * Bubble sort is an algorithm for sorting an array of elements. It works by swapping the adjacent
 * elements if they are in the wrong order.
 * Complexity O(n2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        int n = arr.length;

        //variable used for swapping 2 values in the array
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) { // n-i-1 is an optimization. Also works by using j<n.
                if (arr[j] > arr[j+1]) {
                    // Swap the values.
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        // Display the sorted array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
