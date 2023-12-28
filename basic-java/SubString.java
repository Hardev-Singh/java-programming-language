//  Write a program that prompts the user to enter two Strings, and report whether the
//  second String is a substring of the first String.

import java.util.Scanner;
public class SubString {
  
  public static void main(String[] args) { 
        
        // Scanner class object decleration.
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first string : ");
        String s1 = in.nextLine();
        
        System.out.println("Enter the second string : ");
        String s2 = in.nextLine();
        
        // Checking the substring in string using indexof method of String class.
        String result = (s1.indexOf(s2) != -1) ? (s2 + " is a substring of " + s1) : (s2 + " is not a substring of " + s1);
        System.out.println(result);
    } 
}
