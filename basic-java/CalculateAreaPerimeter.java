/**
 * Auto Generated Java Class.
 **/

import java.util.Scanner;
public class CalculateAreaPerimeter {
  
  public static int shape = 0, calculationSelection = 0;
  
  // Scanner class object decleration.
  public static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) { 
 
    // Calling methods from main method.
    selectShapes();
    shapeSelection();  
  }
    
   // Method to calculate selected shape and calculation.
   public static void shapeSelection(){
    if(shape == 1) traingle();
    else if(shape == 2) square();
    else circle();
    
   }
  
    // // Method to display shapes and prompt user to select one.
    public static void selectShapes(){
    System.out.println("Chose a shape (1) Traingle, (2) Square, (3) Circle: ");
    shape = input.nextInt();
    if(shape < 1 || shape > 3){
       System.out.println("Not a valid selection, please pick again \n" );
       selectShapes();
    }
    else selectCalculation();
    }
    
    // // Method to display and prompt user to select area or perimeter.
    public static void selectCalculation(){
    System.out.println("Choose a claculation (1) Perimeter, (2) Area: ");
    calculationSelection = input.nextInt();
    
    if(calculationSelection < 1 || calculationSelection > 2){
       System.out.println("Not a valid selection, please pick again \n" );
       selectShapes();
    }
    }
    
    // Traingle Method to find area or perimeter as required by user.
    public static void traingle(){
      int a = 0, b = 0, c = 0;
      if(calculationSelection == 2){
        System.out.println("Enter the height and base value of traingle: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("The area of traingle is " + ((a * b)/ 2));
      }
      else{
        System.out.println("Enter the sides of traingle: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        System.out.println("The perimeter of traingle is " + (a + b + c));
      }
    }
    
    // Square Method to find area or perimeter as required by user.
    public static void square(){
      System.out.println("Enter the length of side :");
      int side = input.nextInt();
      if(calculationSelection == 2){
        System.out.println("The area of square is " + Math.pow(side , 2));
      }
      else{
        System.out.println("The perimeter of square is " + (4 * side));
      }
    }
    
    // Circle Method to find area or perimeter as required by user.
    public static void circle(){
      System.out.println("Enter the radius of circle :");
      int radius = input.nextInt();
      if(calculationSelection == 2){
        System.out.println("The area of circle is " + (radius * radius * Math.PI));
      }
      else{
       System.out.println("The perimeter of circle is " + (2 * Math.PI * radius)); 
      }
    }
}
