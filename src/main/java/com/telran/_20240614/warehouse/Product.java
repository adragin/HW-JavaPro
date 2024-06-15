package com.telran._20240614.warehouse;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private int amount;
    private String place;

    public Product(UUID id, String name, int amount, String place) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.place = place;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", place='" + place + '\'' +
                '}';
    }
}
