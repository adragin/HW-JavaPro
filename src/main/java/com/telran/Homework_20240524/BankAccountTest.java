package com.telran.Homework_20240524;

public class BankAccountTest {
    public static void main(String[] args) {

        User user1 = new User("John", "Smit", "1av., NY, NewYork");
        BankAccount userAccount1 = new BankAccount(user1, 100);

        System.out.println(user1);
        userAccount1.deposit(300.99);
        System.out.println(user1);
        userAccount1.withdraw(399.99);
        System.out.println(userAccount1);
        System.out.println("Текущий баланс: " + userAccount1.getBalance());
    }
}
