/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class StudentsGrade {
  public static void main(String[] args) { 
    
     // Scanner class object decleration.
     Scanner input = new Scanner(System.in);
     
     System.out.println("How many students are in the class?");
     int students = input.nextInt();
     
     // Array decleration of students number size.
     double scores[] = new double[students];
     
     double higestScore = 0, lowestScore , max = 95;
     char grade;
     
     // Storing scores of students in grade array.
    for(int i=0; i<students; i++){
       System.out.println("Enter the grade for students #" + (i+1) + ":");
       scores[i] = input.nextDouble();
     }
    
    // Intalizing the score of 1 student to lowest score varaiable.
    lowestScore = scores[0];
     
    for(int i=0; i<students; i++){
      // Determining highest and lowest score of class.
      if( scores[i] > higestScore) higestScore = scores[i];
      if( scores[i] < lowestScore) lowestScore = scores[i];
      
      // Allocating grades according to the score of each students.
      if(scores[i] >= (max-5)) grade = 'A';
      else if(scores[i] >= (max-10) && scores[i] < (max-5)) grade = 'B';
      else if(scores[i] >= (max-15) && scores[i] < (max-10)) grade = 'C';
      else if(scores[i] >= (max-20) && scores[i] < (max-15)) grade = 'D';
      else grade = 'F';
      
      // Displaying grade of each student.
      System.out.println("Students #" + (i+1) + ":" + grade);  
    }
    // Displaying Higest and Lowest scores.
    System.out.println("Highest score: " + higestScore);
    System.out.println("Lowest score: " + lowestScore);
  }    
}
