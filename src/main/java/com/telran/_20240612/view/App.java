package com.telran._20240612.view;

import com.telran._20240612.controller.*;
import com.telran._20240612.model.*;

import java.util.List;
import java.util.Scanner;

public class App {
    private static ContactBuilder contactBuilder = new ContactBuilder();
    private static ContactService contactService = new ContactServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            System.out.println("1. добавить новый контакт");
            System.out.println("2. Найти контакт по имени");
            System.out.println("3. Найти контакт по id");
            System.out.println("4. Показать все контакты");
            System.out.println("5. Обновить контакт");
            System.out.println("6. Удалить контакт по id");
            System.out.println("7. Удалить контакт по имени");
            System.out.println("8. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createContact();
                    break;
                case 2:
                    getContactByName();
                    break;
                case 3:
                    getContactById();
                    break;
                case 4:
                    getAllContacts();
                    break;
                case 5:
                    updateContact();
                    break;
                case 6:
                    deleteById();
                    break;
                case 7:
                    deleteByName();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }

    private static void createContact() {
        System.out.print("Введите имя контакта (\"Имя Фамилия\"): ");
        String name = scanner.nextLine();
        System.out.print("\nВведите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("\nВведите email: ");
        String email = scanner.nextLine();
        System.out.println();

        Contact newContact = contactBuilder
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .build();
        contactService.addContact(newContact);
        System.out.println(" Контакт добавлен.");
    }

    private static void getContactByName() {
        System.out.print("Введите имя контакта для поиска(\"Имя Фамилия\"): ");
        String name = scanner.nextLine();
        Contact contact = contactService.getByName(name);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    private static void getContactById() {
        System.out.print("Введите id контакта для поиска: ");
        String name = scanner.nextLine();

        System.out.println(contactService.getByName(name));
    }

    private static void getAllContacts() {
        List<Contact> myContacts= contactService.getAll();
        System.out.println("{");
        for (Contact contact: myContacts) {
            System.out.println("   " + contact.toString());
        }
        System.out.println("}");
    }

    private static void updateContact() {
        System.out.print("Введите id контакта для обновления: ");
        int id = scanner.nextInt();
        Contact updContact = contactService.getById(id);

        contactService.updateById(id, updContact);

    }

    private static void deleteById() {
        System.out.print("Введите id контакта для удаления: ");
        int id = scanner.nextInt();

        contactService.deleteById(id);

    }

    private static void deleteByName() {
        System.out.print("Введите имя контакта для удаления(\"Имя Фамилия\"): ");
        String name = scanner.nextLine();

    }

}