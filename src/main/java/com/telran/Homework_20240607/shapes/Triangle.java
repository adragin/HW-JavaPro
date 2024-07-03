package com.telran.Homework_20240607.shapes;

import com.telran.Homework_20240607.generator.Generator;

public class Triangle extends Shape{
    private static double sideA;
    private static double sideB;
    private static double sideC;

    private double aSquared = sideA * sideA;
    private double bSquared = sideB * sideB;
    private double cSquared = sideC * sideC;

    private Triangle(){}

    private Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static boolean isDegenerate() {
        return (sideA + sideB <= sideC) ||
               (sideA + sideC <= sideB) ||
               (sideB + sideC <= sideA);
    }

    public static Triangle generate() {
        Triangle instance;
        do {
            sideA = Generator.getNumber();
            sideB = Generator.getNumber();
            sideC = Generator.getNumber();
            instance = new Triangle(sideA, sideB, sideC);
        } while (!isDegenerate());
        return instance;
    }

    public boolean isRight() {
        return (aSquared + bSquared == cSquared) ||
               (aSquared + cSquared == bSquared) ||
               (bSquared + cSquared == aSquared);
    }

    @Override
    double getArea() {
        if (this.isRight()){
            if (aSquared + bSquared == cSquared) {
                return 0.5 * sideA * sideB;
            } else if (aSquared + cSquared == bSquared) {
                return 0.5 * sideA * sideC;
            } else {
                return 0.5 * sideB * sideC;
            }
        } else {
            double semiPerimetr = (sideA + sideB + sideC) / 2;
            return Math.sqrt(semiPerimetr * (semiPerimetr - sideA) * (semiPerimetr - sideB) * (semiPerimetr - sideC));
        }
    }

    @Override
    public String toString() {
        return String.format("Triangle: sideA = %.1f, sideB = %.1f, sideC = %.1f, area = %.1f",
                                sideA, sideB, sideC, getArea());
    }
}
