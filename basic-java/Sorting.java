/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Sorting {  
  public static void main(String[] args) { 
    
    // Scanner class object decleration.
    Scanner input = new Scanner(System.in);
    
    // Array decleration of size 10.
    int values[] = new int[10];
    int i;
    boolean sorted = true;
    
    System.out.println("Enter the list of 10 Integers");
    
    // Storing values in array.
    for(i = 0; i < 10; i++)
        values[i] = input.nextInt();
    
    // Checking the entered values are sorted in accending order or not.
    for(i = 0; i < 9; i++){
      if(values[i] > values[i+1]){
        sorted = false; 
        break;
      }
    }
    
    // Displaying result.
    if(sorted){
    System.out.println("List is sorted !");
    } 
    else System.out.println("List is not sorted !");    
  } 
}
