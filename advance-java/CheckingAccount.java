
public class CheckingAccount extends Account {

 private double overdraftLimit;

 //Default construct.
 public CheckingAccount() {
  super();
  overdraftLimit = -20;
 }

 // Parameterized constructor.
 public CheckingAccount(int id, double balance, double overdraftLimit) {
  super(id, balance);
  this.overdraftLimit = overdraftLimit;
 }

 // Set a overdraft limit.
 public void setOverdraftLimit(double overdraftLimit) {
  this.overdraftLimit = overdraftLimit;
 }

 // Return overdraft limit.
 public double getOverdraftLimit() {
  return overdraftLimit;
 }

 // Withdrawal.
 public void withdraw(double amount) {
  if (getBalance() - amount > overdraftLimit) {
   setBalance(getBalance() - amount);
  }
  else
   System.out.println("Error! Amount exceeds overdraft limit.");
 }

 // Return a String decription of CheckingAccount.
 public String toString() {
  return super.toString() + "\nOverdraft limit: $" + 
  String.format("%.2f", overdraftLimit);
 }
}