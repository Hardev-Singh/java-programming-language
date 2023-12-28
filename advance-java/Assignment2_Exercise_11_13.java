import java.util.Scanner;
import java.util.ArrayList;

public class Assignment2_Exercise_11_13 {
 public static void main(String[] args) {
   
  // Create a scanner
  Scanner input = new Scanner(System.in);

  // Create an ArrayList.
  ArrayList<Integer> list = new ArrayList<Integer>();

  // Prompt ther user to enter 10 integers
  System.out.print("Enter 10 integers: ");
  for (int i = 0; i < 10; i++) {
   list.add(input.nextInt());
  }

  // Invoke removeDuplicate method
  ArrayList<Integer> newList = removeDuplicate(list);

  // Display the distinct integers
  System.out.print("The distinct integers are ");
  for (int i = 0; i < newList.size(); i++) {
   System.out.print(newList.get(i) + " ");
  }
 }

 // Removes the duplicate elements from an array list of integers.
 public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
  
        // Traverse through the first list 
        for (Integer element : list) { 
            if (!newList.contains(element)) { 2
                newList.add(element); 
            } 
        }  
        return newList; 
 }
}