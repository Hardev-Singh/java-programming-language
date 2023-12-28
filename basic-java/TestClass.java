/**
 * Auto Generated Java Class.
 */
public class TestClass {
  public static void main(String[] args) { 
    
    // creating the account class object.
    Account account = new Account(1234 , 100);
    
    // Calling methods of account class through created object.
    account.setAnnualInterestRate(6.7);
    account.withdraw(50.0);
    account.deposit(1000.0);
    
    // printing the account information.
    System.out.println("Balance: $" + account.getBalance());
    System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
    System.out.println("Date Created: " + account.getDateCreated());
  }
}


class Account {
  private int id;
  private double balance, annualInterestRate;
  private java.util.Date dateCreated;
  
  // No argument constructor of account class.
  public Account() {
    dateCreated = new java.util.Date();
  }
   
  // Argument constructor of account class.
  public Account(int id, int balance){
    this();
    this.id = id;
    this.balance = balance;
  }
  
  // Getter and setter of variables.
  public void setId(int id){
    this.id = id;
  }
  
  public int getId(){
    return id;
  }
  
  public void setBalance(double balance){
    this.balance = balance;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public void setAnnualInterestRate(double annualInterestRate){
     this.annualInterestRate = annualInterestRate;
  }
  
  public double getAnnualInterestRate(){
    return annualInterestRate;
  }
  
  public String getDateCreated() {
    return dateCreated.toString();
  }
  
  public double getMonthlyInterestRate(){
    return (annualInterestRate / 100) / 12 ;
  }
  
  // Method to withdrawal balance.
  public void withdraw(double amount){
    if(balance >= amount)
    balance -= amount;
    else System.out.println("Low balance");
  }
  
  // Method to add balance.
  public void deposit(double amount){
    balance += amount;
  }
}