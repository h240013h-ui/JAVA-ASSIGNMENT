package com.banking.system;
import java.lang.Exception;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustException {
    public static void main(String[] args) {
    	
        try {
            withdraw(500.0, 100.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            System.out.println("Withdrawal successful");
        }
    }
}


