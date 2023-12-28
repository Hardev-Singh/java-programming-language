/**
Author: Hardev Singh
Student ID: 239690850
Lab 3
Question 1
Any and all work in this file is my own.
*/

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        // Input from user.
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // Call the fib method.
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fib(int n) {
        // Base case.
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

