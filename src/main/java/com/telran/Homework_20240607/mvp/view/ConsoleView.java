package com.telran.Homework_20240607.mvp.view;

import java.util.Scanner;

public class ConsoleView implements View{

    Scanner scan = new Scanner(System.in);

    @Override
    public String get() {
        return scan.next();
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
