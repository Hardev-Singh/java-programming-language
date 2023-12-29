/**
Author: Hardev Singh
Student ID: 239690850
Lab 10
Question part 1
Any and all work in this file is my own.
*/

public class SequentialSearch {
	// Return the index if the key is found.
    public static int sequentialSearch(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 15, 25, 2, 8, 5, 32, 54, 9, 4, 6, 1, 55, 97, 45};
        
        // Test for the number 9
        int result1 = sequentialSearch(array, 9);
        System.out.println("Index of 9: " + result1);
        
        // Test for an item not in the array.
        int result2 = sequentialSearch(array, 100);
        System.out.println("Index of 100: " + result2); 
    }
}

