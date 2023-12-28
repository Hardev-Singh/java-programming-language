public class AccountTestProgram {
 public static void main(String[] args) {
   
  // Create Account, SavingsAccount and Checking Account objects
  Account account = new Account(1001, 1000);
  SavingsAccount savings = new SavingsAccount(1002, 1000);
  CheckingAccount checking = new CheckingAccount(1003, 1000, -50);
  
  // Set annual interest rate of 4.5%
  account.setAnnualInterestRate(4.5);
  savings.setAnnualInterestRate(4.5);
  checking.setAnnualInterestRate(4.5);

  // Withdraw 
  account.withdraw(500);
  savings.withdraw(500);
  checking.withdraw(500);

  // Deposit 
  account.deposit(600);
  savings.deposit(700);
  checking.deposit(800);

  // Invoke toString methods
  System.out.println(account.toString());
  System.out.println(savings.toString());
  System.out.println(checking.toString());
 }
}