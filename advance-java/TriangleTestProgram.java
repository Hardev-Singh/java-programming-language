import java.util.Scanner;

public class TriangleTestProgram {
 public static void main(String[] args) {
  
  // Create a Scanner object
  Scanner input = new Scanner(System.in);

  // Prompt the user to enter three sides of the triangle.
  System.out.print("Enter three side of the triangle: ");
  double side1 = input.nextDouble();  
  double side2 = input.nextDouble();  
  double side3 = input.nextDouble();
  
  // Create triangle object with user input
  Triangle triangle = new Triangle(side1, side2, side3);

  // Prompt the user to enter a color.
  System.out.print("Enter a color: ");
  String color = input.next();

  // Prompt the user to enter whether the triangle is filled.
  System.out.print("Is the triangle filled (true / false)? ");
  boolean filled = input.nextBoolean();

  // Setting the values.
  triangle.setColor(color);
  triangle.setFilled(filled);

  // Displaying the perimeter and description of triangle.
  System.out.println("Perimeter: " + triangle.getPerimeter());
  System.out.println(triangle.toString());
 }
}