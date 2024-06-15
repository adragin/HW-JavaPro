package com.telran._20240614.warehouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class Storage extends Printable implements WarehousePrintable {
    ArrayList<Product> listProducts;
    HashSet<UUID> listIdProducts;

    public Storage() {
        listProducts = new ArrayList<>();
        listIdProducts = new HashSet<>();
    }

    public void addProduct(Product product) {
        if (listIdProducts.contains(product.getId())) {
            print("UUID already exists.");
            return;
        }
        listProducts.add(product);
        listIdProducts.add(product.getId());
    }

    public Product findProduct(UUID uuid) {
        if (listIdProducts.contains(uuid)) {
            for (Product product : listProducts) {
                if (product.getId().equals(uuid)) {
                    return product;
                }
            }
        }
        return null;
    }

    public Product findProductByName(String name) {
        for (Product product : listProducts) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(UUID uuid) {
        if (!listIdProducts.contains(uuid)) {
            print("UUID not exists.");
            return;
        }
        listProducts.remove(findProduct(uuid));
    }

    @Override
    public void printProductById(UUID uuid) {
        print(findProduct(uuid).toString());
    }

    @Override
    public void printAll() {
        for (Product product : listProducts) {
            print(product.toString());
        }
    }

    @Override
    public void printProductByName(String name) {
        print(findProductByName(name).toString());
    }
}
