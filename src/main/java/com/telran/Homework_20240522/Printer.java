package com.telran.Homework_20240522;

public class Printer {
    public void printPerson(Person person) {
        if (person == null) {
            System.out.println("Здесь почему-то пусто...");
        } else {
            System.out.printf("Имя: %s возраст: %d\n", person.getName(), person.getAge());
        }
    }

    public void printRepository(Repository repository) {
        for (int i = 0; i < repository.size(); i++) {
            printPerson(repository.getPersonById(i));
        }
    }
}
