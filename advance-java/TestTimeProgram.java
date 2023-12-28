import java.util.Scanner;
public class TestTimeProgram {
 
  public static void main(String[] args) { 
     
    // Scanner object creation.
    Scanner input = new Scanner(System.in);
    
    // Array of Timer class.
    Timer [] timer = new Timer[3];
    
    System.out.println("The three groups of values of hours, minutes and seconds : ");
    
    // Prompt user to enter input and assigning to array of object.
    for(int i = 0; i < 3; i++){
      timer[i] =  new Timer(input.nextInt(), input.nextInt(), input.nextInt()); 
    }
    
    // Displaying the Sum of hours, minutes and seconds.
     System.out.println("The total number of hours is " + (timer[0].getHours() + timer[1].getHours() + timer[2].getHours()));
     System.out.println("The total number of minutes  is " + (timer[0].getMinutes() + timer[1].getMinutes() + timer[2].getMinutes()));
     System.out.println("The total number of seconds  is " + (timer[0].getSeconds() + timer[1].getSeconds() + timer[2].getSeconds()));
  }
  
}
