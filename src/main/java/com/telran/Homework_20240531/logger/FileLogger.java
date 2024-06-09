package com.telran.Homework_20240531.logger;

public class FileLogger implements Logger{
    @Override
    public void info(String msg) {
        System.out.println("Operation >> file.log: " + msg);
    }
}
