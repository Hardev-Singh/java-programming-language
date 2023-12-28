/**
 Write a program that asks the user for the number of columns in a square matrix (2-d
array with the same number of rows and columns). Randomly fill the matrix with int values between 1 and 1000. Write methods to calculate the following:
? The average of all values in the matrix
? The sum of all values in the matrix
? The largest value in the matrix
? The smallest value in the matrix
? The value that occurs the most frequently in the matrix
? Display the matrix and the results of all methods
 */

import java.util.Scanner;
public class SquareMatrix {
  public static void main(String[] args) { 
    // Scanner class decleration. 
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of columns in a square matrix ");
    int size = input.nextInt();
    
    int matrix[][] = new int[size][size];
    int row, column, sum = 0, largest = 0, smallest, mean, count = 0;
    
    // Inserting random values in matrix.
    for(row = 0; row < size; row++)
      for(column = 0; column < size; column++)
       matrix[row][column] = (int)(1 + Math.random() * 1000); 
    
    mean = smallest = matrix[0][0];
    
    for(row = 0; row < size; row++){
       for(column = 0; column < size; column++){
         
       // Displaying matrix.
       System.out.print(matrix[row][column] + " ");
       
       // Calculating sum.
       sum += matrix[row][column];
       
       // Largest number in matrix.
       if(largest < matrix[row][column])
         largest = matrix[row][column];
       
       // Smallest number in matrix.
       if(smallest > matrix[row][column])
         smallest = matrix[row][column];
       
       // To calculate the most frequency value in matrix.
       int tempElement = matrix[row][column];
            int tempCount = 0;
            for (int x = 0;  x< matrix.length; x++){
               for(int y=0; y<matrix[x].length; y++){
                  if(matrix[x][y] == tempElement){
                      tempCount++;
                   }
                   if(tempCount > count) {
                      mean = tempElement;
                      count = tempCount;
                   }
               }   
           }
     } 
     System.out.println();
   }
    // Displaying the results of matrix.
    System.out.println("The average of all values in the matrix is: " + sum/25 );
    System.out.println("The sum of all values in the matrix is: " + sum);
    System.out.println("The largest value in the matrix is: " + largest);
    System.out.println("The smallest value in the matrix is: " + smallest);
    System.out.println("The mean value in the matrix is: " + mean);   
  }
}
