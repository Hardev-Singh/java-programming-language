// Use a Scanner to accept 2 integers from the user, then display all of the results from:

// importing Scanner class from the java.util package.
import java.util.Scanner;
public class OperatersCalculation {
  public static void main(String[] args) { 
    
    // Decleration of the object of the Scanner Class.
    Scanner sc = new Scanner(System.in);
    
    // Getting two integer values for the calculation.
    System.out.println("Enter the first integer value : ");
    int value1 = sc.nextInt();
    System.out.println("Enter the Second integer value : ");
    int value2 = sc.nextInt();
    
    //Printing and perfoming operation on the integer values to get specific result.
    System.out.println("Sum of the values : " + (value1 + value2) );
    System.out.println("Difference of the values : " + (value1 - value2) );
    System.out.println("Product of the values : " + (value1 * value2));
    System.out.println("Quotient of the values : " + (value1 / value2) );

 // Getting two Double values for the calculation.
    System.out.println("Enter the first double value : ");
    double value3 = sc.nextDouble();
    System.out.println("Enter the Second double value : ");
    double value4 = sc.nextDouble();
    
    // Printing and perfoming operation on the double values to get specific result.
    System.out.println("Sum of the values : "+ (value3 + value4) );
    System.out.println("Difference of the values : " + (value3 - value4) );
    System.out.println("Product of the values : " + (value3 * value4));
    System.out.println("Quotient of the values : " + (value3 / value4) );
    
  }
}
