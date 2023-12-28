// Write a program that plays a single game of rock, paper, scissors using randomly
// generated numbers. The program must use if-statements to display the winner.

import java.util.Scanner;
public class Gaming { 
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    String choiceSelected1 = "";
    String choiceSelected2;
    
    // Math.random() generates random number from 1 to 3
    int randomNumber1 =(int)(Math.random() * 2) + 1; 
    
    System.out.println("Enter a move!");
    System.out.print("Rock(1), Paper(2), Scissor(3) : ");
    int move = input.nextInt();
    
    // Declearing the choice of the user to the string variable.
    if(move == 1){
      choiceSelected1 = "Rock";
    }
    else if(move == 2){
      choiceSelected1 = "Paper";
    }
    else if(move == 3){
      choiceSelected1 = "Scissor";
    }
    else {
      System.out.println("Not a valid move. Exiting program");
      System.exit(0);
    }
    
    // Declearing the choice of the CPU to the string variable.
    if(randomNumber1 == 1){
      choiceSelected2 = "Rock";
    }
    else if(randomNumber1 == 2){
      choiceSelected2 = "Paper";
    }
    else choiceSelected2 = "Scissor";
    
    // Generating the result by moves of the user and the system.
    if(randomNumber1 == move){
      System.out.println("You have selected " + choiceSelected1 + " CPU has selected " + choiceSelected2);
      System.out.println("It is a tie!");
    }
    else if((randomNumber1 == 1 && move == 2) || (randomNumber1 == 3 && move == 1) || (randomNumber1 == 2 && move == 3) ){
      System.out.println("You have selected " + choiceSelected1+ " CPU has selected " + choiceSelected2 );
      System.out.println("You win!");
    }
    else {
      System.out.println("You have selected " + choiceSelected1+ " CPU has selected " + choiceSelected2 );
      System.out.println("CPU wins!");
    }  
  }
}
