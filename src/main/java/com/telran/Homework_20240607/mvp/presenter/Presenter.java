package com.telran.Homework_20240607.mvp.presenter;

import com.telran.Homework_20240607.generator.Generator;
import com.telran.Homework_20240607.mvp.view.View;
import com.telran.Homework_20240607.mvp.model.Model;
import com.telran.Homework_20240607.shapes.Circle;
import com.telran.Homework_20240607.shapes.Rectangle;
import com.telran.Homework_20240607.shapes.Square;
import com.telran.Homework_20240607.shapes.Triangle;

public class Presenter {
    private final Model m;
    private final View v;

    public Presenter(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    public void append() {
        v.print("1 - Circle, 2 - Rectangle, 3 - Square, 4 - Triangle");
        int choice = Integer.parseInt(v.get());
        switch (choice) {
            case 1:
                m.append(new Circle(Generator.getNumber()));
                break;
            case 2:
                m.append(new Rectangle(Generator.getNumber(), Generator.getNumber()));
                break;
            case 3:
                m.append(new Square(Generator.getNumber()));
                break;
            case 4:
                m.append(Triangle.generate());
                break;
        }
    }

    public void printLast() {
        v.print(m.printLast());
    }

    public void printAll() {
        v.print(m.toString());
    }
}
