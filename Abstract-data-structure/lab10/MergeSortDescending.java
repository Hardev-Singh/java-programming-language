/**
Author: Hardev Singh
Student ID: 239690850
Lab 10
Question part 2
Any and all work in this file is my own.
*/

import java.util.Arrays;

public class MergeSortDescending {

	public static void mergeSort(int[] array) {
        int n = array.length;
        if(n == 1) {
        	return;
        }
        else {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, n);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

	public static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 8, 9, 10, 1, 20, 25, 32, 45, 54, 55, 97};
        
        System.out.println("Unsorted array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
       }
}

