/**
Author: Hardev Singh
Student ID: 239690850
Lab 2
Question 2
Any and all work in this file is my own.
*/

import java.util.*;
public class MaxChar {
	
	// Recursive method to find max char in string.
    public static char maximumChar(String str, char max) {
    	
    	// If length of String is zero return value in max.
        if (str.length() == 0) {
            return max;
        }
        
        // Compare first char with max value.
        char firstChar = str.charAt(0);
        if (firstChar > max) {
            max = firstChar;
        }
        
        // Call recursive method for string from second character.
        return maximumChar(str.substring(1), max);
    }

    // Main method.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Calling method by giving user input string and max value ASCII 0.
        char result = maximumChar(input, '\0');
        System.out.println("The maximum character is: " + result);
    }
}

