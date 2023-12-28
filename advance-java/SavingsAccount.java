public class SavingsAccount extends Account {
 
 // Default constructor.
 public SavingsAccount() {
  super();
 }

 // Parameterized construct.
 public SavingsAccount(int id, double balance) {
  super(id, balance);
 }

 // Withdrawal Method.
 public void withdraw(double amount) {
  if (amount < getBalance()) {
   setBalance(getBalance() - amount);
  }
  else
   System.out.println("Low balance");
 }
}