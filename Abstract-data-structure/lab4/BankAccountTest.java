/**
Author: Hardev Singh
Student ID: 239690850
Lab 4
Question 1
Any and all work in this file is my own.
*/

public class BankAccountTest {

    public static void main(String[] args) {
        try {
            // Valid account creation
            BankAccount validAccount = new BankAccount("GB821234", 100.0);
            System.out.println("Valid Account Created: " + validAccount);

            // Invalid account creation (throws exception)
            BankAccount invalidAccount = new BankAccount("CA123456", 500.0);

            // Deposit and withdraw
            validAccount.deposit(500.0);
            System.out.println("After Deposit: " + validAccount);

            validAccount.withdraw(200.0);
            System.out.println("After Withdrawal: " + validAccount);

            // Invalid withdrawal (throws exception)
            validAccount.withdraw(2000.0);

        } catch (BankException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.flush();
        }
    }
}

