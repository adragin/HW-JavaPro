package com.telran.Homework_20240524;

public class BankAccount {
    private User user;
    private double balance;

    public BankAccount(User user, double balance) {
        this.user = user;
        this.balance = balance;
        this.user.addBankAccount(this);
    }

    public double deposit(double amount) {
        if (amount < 0) {
            return balance;
        }
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            return balance;
        }
        return balance -= amount;
    }

    public String getBalance() {
        return String.format("Баланс счета %s: %.2f", getOwner(), this.balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return user.getFullName();
    }

    public void setOwner(User user) {
        this.user = user;
    }

    public double addInterest(int rate) {
        return balance * rate;
    }

    @Override
    public String toString() {
        String info = String.format("BankAccount: owner - %s, address - %s, balance = %.2f", user.getFullName(), user.getAddress(), balance);
        return info;
    }
}
