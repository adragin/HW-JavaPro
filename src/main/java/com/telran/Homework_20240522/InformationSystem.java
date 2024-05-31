package com.telran.Homework_20240522;

public class InformationSystem {

    public static void main(String[] args) {

        Person person1 = new Person("John Dou", 17);

        Repository repo = new Repository(10);

        repo.append("Имя 1", 22);
        repo.append(person1);
        repo.append("Имя 2", 23);

        Person person = repo.getPersonById(1);

        Printer printer = new Printer();
        System.out.println();
        printer.printPerson(person);

        System.out.println();
        printer.printRepository(repo);

        repo.removePersonById(1);

        System.out.println();
        printer.printRepository(repo);
    }
}
