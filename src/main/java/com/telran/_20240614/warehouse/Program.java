package com.telran._20240614.warehouse;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Product product1 = new Product(UUID.randomUUID(), "Table", 5, "Storage 1");
        Product product2 = new Product(UUID.randomUUID(), "Chair", 10, "Storage 1");
        Product product3 = new Product(UUID.randomUUID(), "Door", 20, "Storage 2");

        storage.printAll();
        storage.addProduct(product1);
        storage.addProduct(product2);
        storage.addProduct(product3);
        storage.printAll();

    }

}
