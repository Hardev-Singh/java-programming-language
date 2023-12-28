/**
 Write a program that asks the user for the number of rows and columns in a
2-dimensional array. Randomly fill each index with either a 0 or 1. Count how many 0’s
and 1’s are in each row and column of the array and report it back to the user. Finally,
print the array.
 */

import java.util.Scanner;
public class Frequency {
  public static void main(String[] args) { 
    // Scanner class decleration. 
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of rows: ");
    int rows = input.nextInt();
    
    System.out.println("Enter the number of columns: ");
    int columns = input.nextInt();
    
    // 2D array decleration.
    int matrix[][] = new int[rows][columns];
    
    // Inserting random values in matrix.
    for(int row = 0; row < rows; row++)
      for(int column = 0; column < columns; column++)
       matrix[row][column] = (int)( Math.random() * 2); 
    
    // Calculating and Dispalying number of 0's and 1's in rows.
    for(int row = 0; row < rows; row++){
      int zeros = 0, ones = 0;
      for(int column = 0; column < columns; column++){
        if(matrix[row][column] == 0) zeros++;
        else ones++;  
    }
      System.out.println("The number of 0\'s in row " +(row + 1) + " is" + zeros);
      System.out.println("The number of 1\'s in row " +(row + 1) + " is" + ones);
    }  
    
    // Calculating and Displaying number of 0's and 1's in columns.
    for(int column = 0; column < columns; column++){
      int zeros = 0, ones = 0;
      for(int row = 0; row < rows; row++){
        if(matrix[row][column] == 0) zeros++;
        else ones++;  
    }
      System.out.println("The number of 0\'s in column " +(column + 1) + " is" + zeros);
      System.out.println("The number of 1\'s in column " +(column + 1) + " is" + ones);
    }
      
    // Displaying matrix.
    for(int row = 0; row < matrix.length; row++){
      for(int column = 0; column < matrix[row].length; column++) 
       System.out.print(matrix[row][column] + " ");   
     System.out.println();
   }   
  }
}
