// Write a program that accepts the investment amount (double), monthly interest rate
// (double), and number of years (int) from the user. The program will then display the
// future value of the investment using the following formula:

// imported math class from java.lang package.
import java.lang.Math;

//imported Scanner class from java.util package.
import java.util.Scanner;
public class FutureValue {
  public static void main(String[] args) { 
    
    // Scanner class used to get data from the user.
    Scanner data = new Scanner(System.in);
    System.out.println("Please enter the investment amount: ");
    
    // Storing the value of data from the user in respective variables.
    double investmentAmount = data.nextDouble();
    System.out.println("Please enter the monthly interest rate: ");
    double monthlyIntersetRate = data.nextDouble();
    System.out.println("Please enter the number of years: ");
    int years = data.nextInt();
    
    // Implimentation of the formula to calculate the future value.
    double futureValue = investmentAmount * Math.pow((1 + monthlyIntersetRate) , years) ;
    
    // Printing future value upto two decimal value byu using round method of Math class.
    System.out.println("The future value of investment is: $" + Math.round(futureValue * 100.0)/100.0);
  } 
}
