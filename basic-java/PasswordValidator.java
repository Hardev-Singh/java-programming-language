//Write a method that checks whether a String is a valid password. It will accept a String
//variable and return a boolean value. The password must contain:
// At least 10 characters
// At least one uppercase letter
// At least one lowercase letter
// At least one number
// At least one symbol


import java.util.Scanner;
public class PasswordValidator
{
  public static void main (String[] args)
  {
    //Scanner class object decleration.
    Scanner input = new Scanner(System.in);
    
    // Method to print password rules on screen.
    passwordRule();
    
    // Checking whether password is valid or not by calling method.
    boolean isSecure =isSecurePassword( input.nextLine());
    
    // While loop to check return value is true or false. If false prompt user to enter password again and again until password is invalid.
    while(!isSecure){
      System.out.println("Password not matching requirements\n");
      passwordRule();
      isSecure =isSecurePassword( input.nextLine()); 
    }  
    // Displaying when correct password entered.
    System.out.println("Password meet all requirements");
  }
  
  // Method to display password requirements.
  public static void passwordRule()
  {
    System.out.println("A valid password must have \n- at least 10 Character\n- at least 1 uppercase letter\n"+
                        " - at least 1 lowercase letter\n- at least 1 digit\n- at least 1 symbol");
  }

  // Method to check the password requirements are followed.
  public static boolean isSecurePassword (String password)
  {
    if ( password.length() < 10) return false;

    boolean uppercase = false;
    boolean lowercase = false;
    boolean digit = false;
    boolean symbol = false;

    for(char c : password.toCharArray())
    {
      if(Character.isLowerCase(c))
        lowercase = true;
      else if(Character.isUpperCase(c))
        uppercase =true;
      else if(Character.isDigit(c))
        digit = true;
      else if(!Character.isLowerCase(c) && !Character.isUpperCase(c) && !Character.isDigit(c))
        symbol = true;
    }
    // Returning true if all the requirements are satistfied.
    return (uppercase && lowercase && digit && symbol);
  }
}