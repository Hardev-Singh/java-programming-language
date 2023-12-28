
import java.util.*;

public class Assignment3_Q1 {
 public static void main(String[] args) {
  // Create a Scanner
  Scanner input = new Scanner(System.in);

  // Array of size 100.
  int[] array = new int[100];
  
  // Randomly assign values to array.
  for (int i = 0; i < array.length; i++) {
   array[i] = (int)(Math.random() * 100) + 1;
  }

  // Prompt the user to enter the index of the array
  System.out.print("Enter the index of the array: ");
  try {
   // Display the corresponding element value
   System.out.println("The corresponding element value is " + 
    array[input.nextInt()]);
  }
  catch (ArrayIndexOutOfBoundsException exception) {
    // Displaying exception.
   System.out.println("Out of Bounds.");
  }
 }
}