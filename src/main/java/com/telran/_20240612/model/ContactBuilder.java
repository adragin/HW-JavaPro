package com.telran._20240612.model;

public class ContactBuilder{
    private final Contact instance;
    private boolean hasNameFlag;

    public ContactBuilder(){
        instance = new Contact();
        hasNameFlag = false;
    }

    public ContactBuilder setName(String name){
        instance.setName(name);
        hasNameFlag = true;
        return this;
    }

    public ContactBuilder setEmail(String email){
        instance.setName(email);
        return this;
    }

    public ContactBuilder setPhoneNumber(String phoneNumber){
        instance.setPhoneNumber(phoneNumber);
        return this;
    }

    public Contact build(){
        if (!hasNameFlag){
            throw new IllegalArgumentException("Контакт должен иметь имя!!!");
        }
        return instance;
    }
}
