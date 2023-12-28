/**
 * Program to find the sum all the numbers between 1 and 10 inclusive.
 */
public class Sum {
  public static void main(String[] s){
    int sum, number = 10;
    // Method to find the sum of all nembers between them inclusive themself. sum=n*(n+1)/2
    sum = number * (number + 1)/2;
    System.out.println("The sum of all numbers between 1 and 10 is :" + sum);
  }
  
}