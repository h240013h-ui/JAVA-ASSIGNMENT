package com.banking.system;

public class Account extends Bank {
    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposited: " + amount + ", New Balance: " + balance);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recordTransaction("Withdrawn: " + amount + ", New Balance: " + balance);
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
