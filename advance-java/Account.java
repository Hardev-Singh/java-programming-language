
public class Account {

 private int id;
 private double balance;
 private double annualInterestRate;
 private java.util.Date dateCreated;

 // Default constructor.
 Account() {
  this(0, 0); 
 }

 // Parameterized constructor.
 Account(int newId, double balance) {
  id = newId;
  balance = newBalance;
  annualInterestRate = 0;
  dateCreated = new java.util.Date();
 }

 // Set id.
 public void setId(int newId) {
  id = newId;
 }

 // Set balance.
 public void setBalance(double newBalance) {
  balance = newBalance;
 }

 // Set annualInterestRate.
 public void setAnnualInterestRate(double annualInterestRate) {
  this.annualInterestRate = annualInterestRate;
 }

 // Return id.
 public int getId() {
  return id;
 }

 // Return balance.
 public double getBalance() {
  return balance;
 }

 // Return annualInterestRate.
 public double getAnnualInterestRate() {
  return annualInterestRate;
 }

 // Return dateCreated.
 public String getDateCreated() {
  return dateCreated.toString();
 }

 // Return monthly interest rate.
 public double getMonthlyInterestRate() {
  return annualInterestRate / 12;
 }

// return monthly interest.
 public double getMonthlyInterest() {
  return balance * (getMonthlyInterestRate() / 100);
 }

 // Withdraw balance.
 public void withdraw(double amount) {
  balance -= amount;
 }

 // Add balance
 public void deposit(double amount) {
  balance += amount;
 }

 // Return a String decription of Account.
 public String toString() {
  return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
   + "\nBalance: $" + String.format("%.2f", balance) + 
   "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
 }
}