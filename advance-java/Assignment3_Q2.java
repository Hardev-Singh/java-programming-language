
import java.util.*;
import java.io.*;

public class Assignment3_Q2 {
 public static void main(String[] args) throws Exception {
  // Check if file exists
  File file = new File("Exercise12_15.txt");
  if (file.exists()) {
   System.out.println("File already exists");
   System.exit(0);
  }

  try (
   // Create output file
   PrintWriter output = new PrintWriter(file);
  ) {
   // Write 100 integers created radomly to file
   for (int i = 0; i < 100; i++) {
    output.print(((int)(Math.random() * 100) + 1));
    output.print(" ");
   }
  }

  // Array list.
  ArrayList<Integer> list = new ArrayList<>();

  try(
   // Scanner object for to read file.
   Scanner input = new Scanner(file);
  ) {
   // Read the data back from the file
   while (input.hasNext()) {
    list.add(input.nextInt());
   }
  }

  // Sort array list
  Collections.sort(list);

  // Display data in increasing order
  System.out.print(list.toString());
 }
}
