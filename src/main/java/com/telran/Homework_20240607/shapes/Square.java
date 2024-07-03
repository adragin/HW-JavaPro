package com.telran.Homework_20240607.shapes;

public class Square extends Shape {
    private double side;

    private Square(){}

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Square: side = %.1f , area = %.1f", side, getArea());
    }
}
