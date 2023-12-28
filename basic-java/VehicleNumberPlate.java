// Write a program that generates a vehicle plate number using the Math.random() method.
// It will consist of three uppercase letters followed by four digits.

public class VehicleNumberPlate {
  public static void main(String[] args) { 
    
    // Generate three random uppercase letters
  int letter1 = 65 + (int)(Math.random() * 26);
  int letter2 = 65 + (int)(Math.random() * 26);
  int letter3 = 65 + (int)(Math.random() * 26); 

  // Generate four random digits
  int number1 = (int)(Math.random() * 10);
  int number2 = (int)(Math.random() * 10);
  int number3 = (int)(Math.random() * 10);
  int number4 = (int)(Math.random() * 10);

  // Display number plate
  System.out.println("" + (char)(letter1) + ((char)(letter2)) + 
   ((char)(letter3)) + number1 + number2 + number3 + number4);
  }
}
