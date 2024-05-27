package com.telran.Homework_20240524;

public class BankAccount {
    private User owner;
    private double balance;

    public BankAccount(User owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double deposit(double amount){
        if (amount < 0){
            return balance;
        }
        return balance += amount;
    }

    public double withdraw(double amount){
        if (amount > balance){
            return balance;
        }
        return balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                "owner='" + owner.getName() + '\'' +
                "address='" + owner.getAddress() + '\'' +
                ", balance=" + balance +
                '}';
    }
}
