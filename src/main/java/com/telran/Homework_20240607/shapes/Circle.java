package com.telran.Homework_20240607.shapes;

public class Circle extends Shape {
    double radius;

    private Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: radius = %.2f , area = %.3f", radius, getArea());
    }
}
