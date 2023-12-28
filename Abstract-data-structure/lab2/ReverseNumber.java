/**
Author: Hardev Singh
Student ID: 239690850
Lab 2
Question 3
Any and all work in this file is my own.
*/

import java.util.Scanner;
public class ReverseNumber {
	// Recursive method to reverse number.
    public static void reverse(int number) {
    	boolean negative = false;
    	
    	// Check if number is negative.
        if (number < 0) {
        	negative = true;
            number = -number;
        }
        
        // Check if number is 1 digit.
        if (number < 10) {
            System.out.print(number);
        } 
        
        // Print last digit and call method again for rest digits.
        else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
        
        // - sign for negative number also reversed with number.
        if(negative)
        	System.out.print("-");
    }

    // Main method.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Reversed number: ");
        reverse(num);
    }
}
