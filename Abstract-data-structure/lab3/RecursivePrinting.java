/**
Author: Hardev Singh
Student ID: 239690850
Lab 3
Question 2
Any and all work in this file is my own.
*/

import java.util.Scanner;
public class RecursivePrinting {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        // Input from user.
        System.out.print("Enter the number of rows (n > 0): ");
        int n = input.nextInt();

        // Call the printUp method.
        printUp(n);
        System.out.println("(printUp)\n");

        // Call the printDown method.
        printDown(n);
        System.out.println("(printDown)");
    }

    public static void printDown(int n) {
        // Base case.
        if (n == 0) {
            return;
        }
        
        // Print asterisks using loop.
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Recursive call for the next row.
        printDown(n - 1);
    }

    public static void printUp(int n) {
        // Base case.
        if (n == 0) {
            return;
        }

        // Recursive call for the next row.
        printUp(n - 1);
        
        // Print asterisks using loop.
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
