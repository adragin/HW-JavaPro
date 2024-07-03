package com.telran.Homework_20240607.generator;

import java.util.Random;

public class Generator {
    static Random random = new Random();

    public static double getNumber() {
        return random.nextDouble(1, 20);
    }
}
