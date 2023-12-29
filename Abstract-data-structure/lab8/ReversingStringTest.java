/**
Author: Hardev Singh
Student ID: 239690850
Lab 8
Question 1
Any and all work in this file is my own.
*/

import java.util.Scanner;
public class ReversingStringTest {
    public static void main(String[] args) {
        try {
        	Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();
            CharStack stack = new CharStack(inputString.length());

            for (char c : inputString.toCharArray()) {
                stack.push(c);
            }

            System.out.print("Reversed string: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
            
        } catch (StackException e) {
        	System.err.println("StackException: " + e.getMessage());
            System.err.flush();
        }
       
    }
}
