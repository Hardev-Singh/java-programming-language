/**
Author: Hardev Singh
Student ID: 239690850
Lab 4
Question 1
Any and all work in this file is my own.
*/

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        if (!verify(accountNumber)) {
            throw new BankException("Invalid account number");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new BankException("Invalid deposit amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new BankException("Invalid withdrawal amount or insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    private boolean verify(String accountNumber) {
        if (accountNumber.length() != 8) {
            return false;
        }

        String modifiedAccountNumber = accountNumber.substring(4) + accountNumber.substring(0, 4);
        modifiedAccountNumber = modifiedAccountNumber.replaceFirst("[A-Z]", Integer.toString((int)(accountNumber.charAt(0))- 55));
        modifiedAccountNumber = modifiedAccountNumber.replaceFirst("[A-Z]", Integer.toString((int)(accountNumber.charAt(1)) - 55));
		
        long number = Long.parseLong(modifiedAccountNumber);
        return number % 11 == 1;
    }

    @Override
    public String toString() {
        return "BankAccount[accountNumber=" + accountNumber + ", balance=$" + balance + "]";
    }
}

