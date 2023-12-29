/**
Author: Hardev Singh
Student ID: 239690850
Lab 8
Question 1
Any and all work in this file is my own.
*/

import java.util.Scanner;
public class ParanthesisCheckingTest {
	public static void main(String[] args) {
		 try {
			    Scanner input = new Scanner(System.in);
	            System.out.print("Enter a string: ");
	            String inputString = input.nextLine();
	            CharStack stack = new CharStack(inputString.length());

	            for (char c : inputString.toCharArray()) {
	                if (c == '(') {
	                    stack.push(c);
	                }
	                else if (c == ')') {
	                    if (stack.isEmpty()) {
	                        throw new StackException("The string \"" + inputString + "\" has too many closing parentheses.");
	                    }
	                    stack.pop();
	                }
	            }

	            if (stack.isEmpty()) {
	                System.out.println("The string \"" + inputString + "\" has the correct number of parentheses.");
	            } else {
	                System.out.println("The string \"" + inputString + "\" has too many opening parentheses.");
	            }
	        }
		 catch (StackException e) {
			 System.err.println("StackException: " + e.getMessage());
	            System.err.flush();
	        }
	}
}
