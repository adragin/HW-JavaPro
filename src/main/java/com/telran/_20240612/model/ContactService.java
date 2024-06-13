package com.telran._20240612.model;

import java.util.List;

public interface ContactService {
    public void addContact(Contact contact);

    public void updateById(int id, Contact contact);

    public Contact getByName(String name);

    public Contact getById(int id);

    public List<Contact> getAll();

    public void deleteById(int id);

    public void deleteByName(String name);
}
