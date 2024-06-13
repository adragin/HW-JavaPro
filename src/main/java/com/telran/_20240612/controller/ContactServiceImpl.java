package com.telran._20240612.controller;

import com.telran._20240612.model.Contact;
import com.telran._20240612.model.ContactService;
import com.telran._20240612.model.Repository;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    private Repository repository = new Repository();
    private int id = 1;

    @Override
    public void addContact(Contact contact) {
        contact.setId(id++);
        repository.getContacts().add(contact);
    }

    @Override
    public void updateById(int id, Contact newContact) {
        Contact contact = getById(id);
        if (newContact.getName() != null && !newContact.getEmail().isEmpty()) {
            contact.setName(newContact.getName());
        }

        if (newContact.getEmail() != null && !newContact.getEmail().isEmpty()) {
            contact.setEmail(newContact.getEmail());
        }

        if (newContact.getPhoneNumber() != null && !newContact.getPhoneNumber().isEmpty()) {
            contact.setPhoneNumber(newContact.getPhoneNumber());
        }
    }

    @Override
    public Contact getByName(String name) {
        for (Contact contact : repository.getContacts()) {
            if (contact.getName()
                    .replace(" ", "")
                    .toLowerCase()
                    .equals(name
                            .replace(" ", "")
                            .toLowerCase())) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact getById(int id) {
        return repository.getContacts().get(id);
    }

    @Override
    public List<Contact> getAll() {
        return repository.getContacts();
    }

    @Override
    public void deleteById(int id) {
        repository.getContacts().remove(id);
    }

    @Override
    public void deleteByName(String name) {
        Contact  contact = getByName(name);
        repository.getContacts().remove(contact);
    }
}
