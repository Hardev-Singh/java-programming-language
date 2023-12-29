/**
Author: Hardev Singh
Student ID: 239690850
Lab 10
Question part 2
Any and all work in this file is my own.
*/

public class BinarySearch {

    public static int binarySearch(int[] A, int start, int end, int k) {
        int n = A.length;

        if (start < 0 || start >= n || end < 0 || end >= n || start > end) {
            return -1; 
        } else {
            int mid = (start + end) / 2;

            if (A[mid] == k) {
                return mid; 
            } else if (k < A[mid]) {
                return binarySearch(A, start, mid - 1, k); 
            } else if (k > A[mid]) {
                return binarySearch(A, mid + 1, end, k); 
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 5, 6, 8, 9, 10, 15, 20, 25, 32, 45, 54, 55, 97};

        // Test for the number 20
        int result1 = binarySearch(sortedArray, 0, sortedArray.length - 1, 20);
        System.out.println("Index of 20: " + result1); 

        // Test for an item not in the array (e.g., 30)
        int result2 = binarySearch(sortedArray, 0, sortedArray.length - 1, 30);
        System.out.println("Index of 30: " + result2); 
    }
}

