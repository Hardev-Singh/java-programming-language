//Calculate the mean and standard deviation for a set of user-entered integers. Prompt the
//user for the set size before values are entered.
  
import java.util.Scanner;
public class StandardDeviation {
  public static void main(String[] args) { 
    
    // Scanner class object decleration.
    Scanner input = new Scanner(System.in);
    
    int sum = 0, sumSquare = 0;
    double varaince = 0;
    
    // prompt user to enter size and value of set.
    System.out.println("What is set size :");
    int setSize = input.nextInt();
    
    // Declearing array of set size.
   // int set[] = new int[setSize]; 
    
    System.out.println("Enter the set :");
    
    // Calculating sum of set and storing value in array.
    for(int i=0; i<setSize ;i++){
       int setValue = input.nextInt();
       sum += setValue;
       sumSquare += (setValue * setValue);
    }
    
    // Calculating the value of mean.
    double mean = sum / setSize;
    
    // Calculating the value of variance square of (value - mean)
    varaince = sumSquare - (Math.pow(sum, 2)/setSize);
    
    // Calculating standard deviation.
    double standardDeviation = Math.sqrt(varaince / (setSize-1));
    
    // Displaying the mean and standard deviation.
    System.out.println("The mean of this set is : " + mean);
    System.out.printf("The standard deviation of this set is : %.4f ",standardDeviation);
  }
}
