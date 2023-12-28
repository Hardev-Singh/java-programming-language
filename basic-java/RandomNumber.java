// Write a program that randomly generates a math question using integers from 1 to 16.
// The program will gather the user's answer using a Scanner and then display if they are
// correct or not.

import java.util.Scanner;
public class RandomNumber {
  public static void main(String[] args) { 
    
    Scanner input = new Scanner(System.in);
    
    // Math.random() generates random number from 1 to 16
    int randomNumber1 =(int)(Math.random() * 15) + 1;
    int randomNumber2 =(int)(Math.random() * 15) + 1;
    int operaterNumber =(int)(Math.random() * 4);
    int result;
    
    System.out.println(randomNumber1+" "+randomNumber2+"  "+operaterNumber);
    
    // Switch case to perform random operator on numbers.
    switch(operaterNumber){
      
      // 1 for the Addition operator.
      case 1: System.out.println(randomNumber1 + " + " +randomNumber2 + " = ");
              result = randomNumber1 + randomNumber2;
              break;
      
      // 2 for the Subtraction operator.
      case 2: System.out.println(randomNumber1 + " - " +randomNumber2 + " = ");
              result = randomNumber1 - randomNumber2;
              break; 
              
      // 3 for the Multiplication operator.
      case 3: System.out.println(randomNumber1 + " * " +randomNumber2 + " = ");
              result = randomNumber1 * randomNumber2;
              break;
              
      // Default for the Division operator.
      default: System.out.println(randomNumber1 + " / " +randomNumber2 + " = ");
               result = randomNumber1 / randomNumber2;
               break;           
    }
    
    // Getting Answer from the user for match with system ans.
    if(input.nextInt() == result){
      System.out.println("Correct!");
    }
    else System.out.println("Incorrect! Correct answer is " +result);
  }
}
