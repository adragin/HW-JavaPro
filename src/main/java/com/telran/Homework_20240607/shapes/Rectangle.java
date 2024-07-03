package com.telran.Homework_20240607.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    private Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: width = %.1f, height = %.1f, area = %.1f", width, height, getArea());
    }
}
