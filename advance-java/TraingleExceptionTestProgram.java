import java.io.*;
import java.util.Scanner;

public class TraingleExceptionTestProgram {
  public static void main(String[] args) throws Exception {
    // Assigning file name.
    File file = new File("sides.txt");
    
    // Creating Scanner object to read data from file.
    Scanner input = new Scanner(file);
    
    try{
      // Triangle object creation and constructor calling.
      Triangle triangle = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
    }
    catch(IllegalTraingleException exception){
      // Printing exception.
     System.out.println(exception); 
    }
  }
}
