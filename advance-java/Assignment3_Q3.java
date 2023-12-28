
import java.util.*;

public class Assignment3_Q3 {
 public static void main(String[] args) {

  // Read file from web
  try {
   java.net.URL url = new java.net.URL(
    "http://liveexample.pearsoncmg.com/data/Scores.txt");
   
   // Scanner object to read from file.
   Scanner input = new Scanner(url.openStream());
   
   double sum = 0;
   int count = 0;
   
   // reading values from the file.
   while (input.hasNext()) {
     sum += input.nextDouble();
     count++;
   }

   // Displaying sum and average of scores.
   System.out.printf("Total scores is: %.2f\n", sum);
   System.out.printf("Average score is: %.2f\n", (sum / count));

  } // handle exceptions
  catch (java.net.MalformedURLException exception) {
   System.out.println("Invalid URL");
  }
  catch (java.io.IOException exception) {
   System.out.println("I/O Errors: so such file");
  }
 }
}