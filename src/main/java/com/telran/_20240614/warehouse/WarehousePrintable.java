package com.telran._20240614.warehouse;

import java.util.UUID;

public interface WarehousePrintable {
    void printProductById(UUID uuid);
    void printAll();
    void printProductByName(String name);
}
