/**
 Loop through all integers from 1 to 1,000,000. For all integers from 1 to 9, count how
 many values are divisible by each integer. Print out the count for each integer..
 */
public class DivisibleCount {
  public static void main(String[] args) { 
    
    int count;
    
    // iterating through each value for counting divisible of each value.
    for(int i = 1; i < 10; i++){
      count = 0;
      for(int j=1; j <= 1000000; j++){
        if(j % i == 0)
           count++;
      }
      
      // Displaying the output.
      System.out.println("There are " + count + " numbers divisible by " + i);
    }  
  } 
}
