package com.telran.Homework_20240524;

import com.github.javafaker.Faker;

public class BankAccountTest {
    public static void main(String[] args) {
        Faker faker = new Faker();

        User user1 = new User(faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(), 2);

        BankAccount user1_DeutscheBank = new BankAccount(user1, 1000);
        BankAccount user1_UniversalBank = new BankAccount(user1, 5000);


        System.out.println(user1_DeutscheBank);
        user1_DeutscheBank.deposit(301);
        System.out.println(user1_DeutscheBank);
        user1_DeutscheBank.withdraw(199.98);
        System.out.println(user1_DeutscheBank.getBalance());
        System.out.println(user1.getFullName());
        user1.setAddress(faker.address().streetAddress());
        System.out.println(user1_DeutscheBank);

        System.out.println(user1);


    }
}
