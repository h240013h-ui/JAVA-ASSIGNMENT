package com.banking.system;


public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Lamisha Mabgwe ", 5000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0); // Exceeds balance
        System.out.println("Current Balance: " + account.getBalance());
    }
}

