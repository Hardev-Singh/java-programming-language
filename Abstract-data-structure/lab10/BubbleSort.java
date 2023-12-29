/**
Author: Hardev Singh
Student ID: 239690850
Lab 10
Question part 1
Any and all work in this file is my own.
*/

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 15, 25, 2, 8, 5, 32, 54, 9, 4, 6, 1, 55, 97, 45};
        
        System.out.println("Array before sorting: " + Arrays.toString(array));
        
        // Sorting the array using Bubble Sort
        bubbleSort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}

