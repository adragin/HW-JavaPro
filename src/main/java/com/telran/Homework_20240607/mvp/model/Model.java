package com.telran.Homework_20240607.mvp.model;

import com.telran.Homework_20240607.shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Shape> shapeList = new ArrayList<>();

    public void append(Shape shape) {
        shapeList.add(shape);
    }


    public String printLast() {
        if (shapeList.isEmpty()) {
            return "No shapes";
        }
        return shapeList.get(shapeList.size() - 1).toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapeList) {
            sb.append(shape.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
