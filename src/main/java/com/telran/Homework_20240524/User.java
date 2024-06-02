package com.telran.Homework_20240524;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private BankAccount[] bankAccounts;

    public User(String firstName, String lastName, String address, int numBankAccounts) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.bankAccounts = new BankAccount[numBankAccounts];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBankAccount(BankAccount bankAccount) {
        if (bankAccount == null) {
            throw new IllegalArgumentException("Номер банковского счета не может быть пустым");
        }
        for (int i = 0; i < this.bankAccounts.length; i++) {
            if (bankAccounts[i] == null) {
                this.bankAccounts[i] = bankAccount;
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder userInfo = new StringBuilder("User : " + firstName + " " + lastName + "\n" +
                "  address: " + address + "\n");
        for (int i = 0; i < bankAccounts.length; i++) {
            userInfo.append("  Bank ")
                    .append(i + 1)
                    .append(": ")
                    .append(bankAccounts[i].getBalance())
                    .append('\n');
        }
        return userInfo.toString();
    }
}
